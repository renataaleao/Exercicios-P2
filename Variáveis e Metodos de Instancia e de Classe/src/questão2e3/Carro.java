package quest�o2e3;

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
				"\nvidro el�trico: " + vidroEletrico + "\nar condicionado: " + arCondicionado + "\ncambio autom�tico: " + 
				cambioAutomatico + "\ndire��o el�trica: " + direcaoEletrica + "\npre�o: " + calculaPreco();
	}
	
	/**
	 QUEST�O 3:
	 	TIVEMOS QUE DEFINIR PROMO��O INDIVIDUALMENTE PARA CADA CARRO.
	 	SE NOSSA PROMO��O FOR APLIC�VEL PARA TODOS OS CARROS, USARIAMOS VARI�VEL DE CLASSE, POIS ASSIM ADICIONARIAMOS
	 	A PROMO��O A TODOS OS CARRO, SE QUISESSEMOS DEFINIR S� ALGUNS CARROS COM PROMO��O USAR�AMOS VARI�VEL DE OBJETO,
	 	POIS ALGUNS CARROS TERIAM PROMO��O E OUTROS CONTINUARIAM INALTER�VEIS.
	**/
}
