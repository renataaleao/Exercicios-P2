package questao4;

public class JogoEncerradoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public JogoEncerradoException() {
		super("N�o � permitido tentar mais palpites, o jogo est� encerrado");
	}
}
