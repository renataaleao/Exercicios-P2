import java.util.ArrayList;
import java.util.List;

import Enums.Carboidrato;
import Enums.Proteina;
import Enums.SaborBebida;
import Enums.Tamanho;

public class Cardapio {
	
	private List<Item> cardapio;
	private List<Refeicao> refeicoes;
	private List<Bebida> bebidas;
	
	public Cardapio() {
		bebidas = new ArrayList<Bebida>();
		bebidas.add(new Bebida(Tamanho.PEQUENO, SaborBebida.COCA));
		bebidas.add(new Bebida(Tamanho.MEDIO, SaborBebida.CAFE));
		bebidas.add(new Bebida(Tamanho.GRANDE, SaborBebida.AGUA));
		bebidas.add(new Bebida(Tamanho.MEDIO, SaborBebida.CERVEJA));
		
		refeicoes = new ArrayList<Refeicao>();
		refeicoes.add(new Refeicao(Proteina.FRANGO, Carboidrato.BATATA));
		refeicoes.add(new Refeicao(Proteina.LINGUICA, Carboidrato.PURE));
		refeicoes.add(new Refeicao(Proteina.MAMINHA, Carboidrato.FEIJAO));
		refeicoes.add(new Refeicao(Proteina.PICANHA, Carboidrato.ARROZ));
		
		cardapio = new ArrayList<Item>();
		cardapio.addAll(bebidas);
		cardapio.addAll(refeicoes);
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	
	public List<Item> getCardapio() {
		return cardapio;
	}
}
