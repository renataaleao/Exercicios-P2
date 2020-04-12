package questão3;

public class Carro {

	String nome, marca, cor;
	int portas, id;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;

	public Carro(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.cor = "branca";
		this.portas = 2;
		this.id = 210;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}

	public Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.id = 211;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}

	public Carro() {
	} // construtor sem argumentos - default

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

		if (vidroEletrico == true) {
			precoFinal += 1250;
		}
		if (arCondicionado == true) {
			precoFinal += 1250;
		}
		if (cambioAutomatico == true) {
			precoFinal += 1250;
		}
		if (direcaoEletrica == true) {
			precoFinal += 1250;
		}
		return precoFinal;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nmarca: " + marca + "\ncor: " + cor + "\nportas: " + portas + "\nvidro elétrico: "
				+ vidroEletrico + "\nar condicionado: " + arCondicionado + "\ncambio automático: " + cambioAutomatico
				+ "\ndireção elétrica: " + direcaoEletrica + "\npreço: " + calculaPreco();
	}
}
