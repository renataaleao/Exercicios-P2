package questao2;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
	
	ContaBancaria conta;
	ContaPoupanca poupanca;
	ContaCorrente corrente;
	
	@Before
	public void setUp() throws Exception {
		poupanca = new ContaPoupanca("Renata", "rgl123", 1000); 
		corrente = new ContaCorrente("Noemi", "nbn456", 1500);
	}

	@org.junit.Test
	public void testContaPoupanca() throws SenhaInvalidaException {
		ContaPoupanca poupanca2 = new ContaPoupanca("Lucas", "lps789", 1200);
		try {
			poupanca.transferir("rgl123", 500, poupanca2);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals(495, poupanca.saldo, 0.00001);
		assertEquals(1700, poupanca2.saldo, 0.00001);
	}
	
	@org.junit.Test
	public void testContaCorrente() throws SenhaInvalidaException {
		ContaCorrente corrente2 = new ContaCorrente("Tiago", "tas1011", 1400);
		try {
			corrente.transferir("nbn456", 200, corrente2);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals(1299.75, corrente.saldo, 0.00001);
		assertEquals(1600, corrente2.saldo, 0.00001);
	}

}
