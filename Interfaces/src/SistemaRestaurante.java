
public class SistemaRestaurante {
	
	private Cliente cliente;
	//private int mesa;
	
	public void adicionarCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionarPedido(int mesa, Item item) throws ClienteInexistenteException {
		if(cliente.getMesa() != mesa) {
			throw new ClienteInexistenteException();
		} else {
			cliente.adicionarPedido(item);
		}
	}
	
	public void removerPedido(int mesa, Item item) throws PedidoInexistenteException {
		if(!cliente.getPedidos().contains(mesa)) {
			throw new PedidoInexistenteException();
		} else {
		cliente.removerPedido(item);
		}
	}
	
	public double computarPagamentoCliente(int mesa) {
		double conta = 0; 
		if(cliente.getPedidos().contains(mesa)) {
			 conta = cliente.getConta();
		}
		return conta; 
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) throws PagamentoInvalidoException{
		boolean recebido;
		if(pagamento < cliente.getConta() || !cliente.getPedidos().contains(mesa)) {
			recebido = false;
			throw new PagamentoInvalidoException();
		} else {
			recebido = true;
		}
	}
}
