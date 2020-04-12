package questão2e3;

public class Carro {
	
	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	boolean promocao;
	
	public Carro(String nome, String marca, double precoBase, boolean promocao) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = "branca";
		this.portas = 2;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
		this.promocao = true;
	}
	
	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado, 
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase, boolean promocao) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
		this.promocao = promocao;
	}
	
	public Carro() {} //construtor sem argumentos - default
	
	public double calculaPreco() {
		double precoFinal = precoBase;
		switch (this.cor) {
		case "branco":
		case "azul":
		case "vermelho":
		case "preto":
			break;

		default:
			precoFinal += 1000;
			break;
		}
		
		if(vidroEletrico == true) {
			precoFinal += 1250;
		} if (arCondicionado == true) {
			precoFinal += 1250;
		} if (cambioAutomatico == true) {
			precoFinal += 1250;
		} if (direcaoEletrica == true) {
			precoFinal += 1250;
		} if (promocao == true) {
			precoFinal = precoFinal - (precoFinal * 0.10);
		}
		return precoFinal;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + "\nmarca: " + marca + "\ncor: " + cor + "\nportas: " + portas + 
				"\nvidro elétrico: " + vidroEletrico + "\nar condicionado: " + arCondicionado + "\ncambio automático: " + 
				cambioAutomatico + "\ndireção elétrica: " + direcaoEletrica + "\npreço: " + calculaPreco();
	}
	
	/**
	 QUESTÃO 3:
	 	TIVEMOS QUE DEFINIR PROMOÇÃO INDIVIDUALMENTE PARA CADA CARRO.
	 	SE NOSSA PROMOÇÃO FOR APLICÁVEL PARA TODOS OS CARROS, USARIAMOS VARIÁVEL DE CLASSE, POIS ASSIM ADICIONARIAMOS
	 	A PROMOÇÃO A TODOS OS CARRO, SE QUISESSEMOS DEFINIR SÓ ALGUNS CARROS COM PROMOÇÃO USARÍAMOS VARIÁVEL DE OBJETO,
	 	POIS ALGUNS CARROS TERIAM PROMOÇÃO E OUTROS CONTINUARIAM INALTERÁVEIS.
	**/
}
