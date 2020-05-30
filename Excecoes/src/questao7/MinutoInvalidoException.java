package questao7;


public class MinutoInvalidoException extends Exception {


	private static final long serialVersionUID = 1L;
	
	public MinutoInvalidoException() {
		super("Minuto fora do intervalo de 0 a 59.");
	}
}
