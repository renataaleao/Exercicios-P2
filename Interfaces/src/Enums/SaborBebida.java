package Enums;

public enum SaborBebida {
	
	COCA(5.0), AGUA(2.0), CERVEJA(3.0), CAFE(1.0);
	
	private double custo;
	
	private SaborBebida(double custo) {
		this.custo = custo;
	}
	
	public double getCusto() {
		return custo;
	}
}
