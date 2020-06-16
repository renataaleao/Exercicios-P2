
public class CarroAlugadoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CarroAlugadoException() {
		super("O carro ja foi alugado");
	}

}
