package questao2;

public class SenhaInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SenhaInvalidaException() {
		super("A senha informada é inválida.");
	}

}
