import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMovida {
	
	private Movida movida;
	private Locadora locadora;
	private Data data1;
	private Carro carro;
	
	@Before
	public void setUp() throws Exception {
		carro = new Carro("Celta", "Chevrolet", 2015, 100.0);
		movida = new Movida(locadora.carros);
	}

	@Test
	public void testAlugarCarro() throws CarroAlugadoException {
		data1 = new Data(22, 06);
		Data data2 = new Data(29, 06);
		movida.alugarCarro(carro, data1, data2);
		
		
	}

}
