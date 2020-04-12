package questão2;

public class Imovel {
	
	private String tipoImobiliaria, nomeImobiliaria;
	private int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	private boolean elevador, piscina, quadra;

	public Imovel(String tipoImobiliaria, String nomeImobiliaria, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean piscina, boolean quadra, boolean elevador) {
		this.tipoImobiliaria = "casa";
		this.nomeImobiliaria = nomeImobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		this.elevador = elevador;
	}

	public Imovel(String tipoImobiliaria, String nomeImobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		this.tipoImobiliaria = "apto";
		this.nomeImobiliaria = nomeImobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}

	public double calculaPreco() {
		double preco = 0;
		if(pavimento > 5) {
			preco = (pavimento - 5) * 2000;
		}
		if (elevador == true) {
			preco += 2500;
		}
		if (piscina == true) {
			preco += 2500;
		}
		if (quadra == true) {
			preco += 2500;
		}
		if(metrosQuadrados > 0) {
			preco += metrosQuadrados * 5000;
		}
		return preco;
	}

	@Override
	public String toString() {
		return "\nImovel: " + tipoImobiliaria + "\nImobiliaria: " + nomeImobiliaria + "\nNúmero de pavimentos: " + pavimentos + "\nLocalizado no pavimento: " + pavimento + "\nquartos: " + quartos + "\nbanheiros: "
				+ banheiros + "\nsuites:" + suites + "\npiscina: " + piscina + "\nquadra: " + quadra + "\nelevador: " + elevador
				+ "\npreço: R$" + calculaPreco();
	}
}
