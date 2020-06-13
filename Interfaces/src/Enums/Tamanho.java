package Enums;

public enum Tamanho {
	
	PEQUENO(0), MEDIO(2.0), GRANDE(2.8);
	
	private double custo;
	
	private Tamanho(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}
}
