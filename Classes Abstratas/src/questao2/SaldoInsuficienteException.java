package questao2;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SaldoInsuficienteException() {
		super("O saldo � insuficiente para transfer�ncia.");
	}

}
