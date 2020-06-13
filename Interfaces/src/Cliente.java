import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private int mesa;
	private List<Item> pedidos;
	private Refeicao refeicoes;
	private Bebida bebidas;
	
	public Cliente(String nome, int mesa) {
		this.nome = nome;
		this.mesa = mesa;
		this.pedidos = new ArrayList<Item>();
	}
	
	public int getMesa() {
		return mesa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarPedido(Item item) {
		pedidos.add(item);
	}
	
	public void removerPedido(Item item) {
		pedidos.remove(item);
	}
	
	public List<Item> getPedidos() {
		return pedidos;
	}
	
	public double getConta() {
		double conta = refeicoes.getPreco() + bebidas.getPreco();
		return conta;
	}
}
