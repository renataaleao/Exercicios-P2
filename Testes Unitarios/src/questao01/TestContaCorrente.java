package questao01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestContaCorrente {
	
	private ContaCorrente conta;
	
	@Before
	public void setup() {
		conta = new ContaCorrente(1000, 01, "Renata");
	
	}
	
	@Test
	public void testDeposito() {
		double quantiaDeposita = 200;
		conta.depositar(quantiaDeposita);
		double saldo = conta.getSaldo();
		
		assertEquals(700, saldo, 0.0001);
	}
	
	@Test
	public void testDebitar() {
		double quantiaDebitar = 100;
		conta.debitar(quantiaDebitar);
		double saldo = conta.getSaldo();
		
		assertEquals(400, saldo, 0.0001);
	}
	
	@Test
	public void testTransferir() {
		double quantiaTransfere = 100;
		ContaCorrente conta02 = new ContaCorrente(1000, 02, "Noemi");
		conta.transferir(quantiaTransfere, conta02);
		
		assertEquals(400, conta.getSaldo(), 0.0001);
		assertEquals(600, conta02.getSaldo(), 0.0001);
	}
	
	

}
