import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLocadora {
	
	private Locadora locadora;
	
	@Before
	public void setup() throws Exception{
		locadora.adicionarCarro("Celta", "Chevrolet", 2015, 100.0);
	}
	
	@org.junit.Test
	public void testAdicionarCarro() {
		locadora.adicionarCarro("Corsa", "Chevrolet", 2018, 150.0);
		
		assertEquals(2, locadora.getCarros().size());
	}
	
	@Test
	public void testRemoverCarroExistente() throws CarroInexistenteException {
		locadora.removerCarro("Corsa", "Chevrolet", 2018);
		
		assertEquals(1, locadora.carros.size());
	}
	
	

}
