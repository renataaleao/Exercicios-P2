package questao6;

public class ValorMinimoParcelaException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorMinimoParcelaException() {
		super("Valor inferior ao valor mínimo definido.");
	}

}
