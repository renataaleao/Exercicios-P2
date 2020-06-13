
public class PedidoInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PedidoInexistenteException() {
		super("O pedido é inexistente!");
	}
}
