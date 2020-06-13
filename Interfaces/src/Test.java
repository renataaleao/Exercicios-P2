import static org.junit.Assert.*;

import org.junit.Before;

import Enums.Carboidrato;
import Enums.Proteina;
import Enums.SaborBebida;
import Enums.Tamanho;

public class Test {

	private Cliente cliente;
	private SistemaRestaurante sistema;
	//private Refeicao refeicao;
	//private Bebida bebida;
	
	@Before
	public void setup() {
		cliente = new Cliente("Renata", 01);
	}
	
	@org.junit.Test
	public void TestCliente() {
		Item item = new Refeicao(Proteina.FRANGO, Carboidrato.ARROZ);
		item = new Bebida(Tamanho.MEDIO, SaborBebida.COCA);
		cliente.adicionarPedido(item);
		cliente.adicionarPedido(item);
		
		assertEquals(2, cliente.getPedidos().size());
		
		cliente.removerPedido(item);
		assertEquals(1, cliente.getPedidos().size());
	}
	
	

}
