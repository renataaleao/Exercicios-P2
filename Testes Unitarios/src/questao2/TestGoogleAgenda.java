package questao2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class TestGoogleAgenda {
	
	private GoogleAgenda agenda = new GoogleAgenda();
	private Reuniao reuniao;
	private Data data;

	List<String> participantes = new ArrayList<String>();
	
	@Before
	public void setup() {
		participantes.add("Renata");
		participantes.add("Noemi");
		participantes.add("Lucas");
		data = new Data(20, 03, 2020, 14, 15);
		reuniao = new Reuniao(data, participantes);
	}
	
	@Test
	public void adicionaReuniaoTest() {
		agenda.adicionarReuniao(reuniao);
		Data data2 = new Data(12, 01, 2020, 13, 17);
		assertEquals(1, agenda.getQuantidadeReunioes());
		
		agenda.adicionarReuniao(data2, participantes);
		assertEquals(2, agenda.getQuantidadeReunioes());
	}
	
	
	
	
	

}
