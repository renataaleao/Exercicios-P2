package questao1;

public class MesInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MesInvalidoException(int mesEscolhido) {
		super("O n�mero do m�s deve estar contido no intervalo [1, 12]\n"
				+ "M�s escolhido: "+mesEscolhido);
	}
}
