
public class CarroInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CarroInexistenteException() {
		super("O carro não existe.");
	}

}
