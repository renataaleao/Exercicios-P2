package Enums;

public enum Proteina {
	
	PICANHA(20.0), MAMINHA(15.0), FRANGO(15.0), LINGUICA(10.0);

	public double custo;
	
	private Proteina(double custo) {
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	} 
	
	
}
