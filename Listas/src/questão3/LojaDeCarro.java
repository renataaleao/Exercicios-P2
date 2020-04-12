package questão3;

import java.util.ArrayList;
import java.util.List;

public class LojaDeCarro {
	
	List<String> carrosDisponiveis = new ArrayList<String>();
	List<String> carrosVendidos = new ArrayList<String>();
	
	public void adicionarCarro(String carro) {
		carrosDisponiveis.add(carro);
	}
	
	public List<String> exibirCarrosDisponiveis() {
		return carrosDisponiveis;
	}
	
	//INCOMPLETA, NÃO CONSEGUI ENTENDER A QUESTÃO
}
