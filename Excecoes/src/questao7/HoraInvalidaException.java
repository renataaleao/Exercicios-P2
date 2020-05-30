package questao7;

public class HoraInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public HoraInvalidaException() {
		super("Hora fora do intervaldo de 0 a 23.");
	}
}
