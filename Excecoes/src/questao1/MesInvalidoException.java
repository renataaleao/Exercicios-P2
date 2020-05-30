package questao1;

public class MesInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MesInvalidoException(int mesEscolhido) {
		super("O número do mês deve estar contido no intervalo [1, 12]\n"
				+ "Mês escolhido: "+mesEscolhido);
	}
}
