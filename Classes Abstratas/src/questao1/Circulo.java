package questao1;

public class Circulo extends Figura {
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	@Override
	public double calculaArea() {
		double area = 3.14 * raio * raio;  
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * 3.14 * raio;
		return perimetro;
	}

}
