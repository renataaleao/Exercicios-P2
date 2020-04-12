package questão1;

public class Retangulo {

	private double largura, altura;

	public Retangulo() {
		largura = 0;
		altura = 0;

	}

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;

	}

	public void setLargura(double largura) {
		this.largura = largura;

	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public double perimetro() {
		double perimetro = 2 * (altura + largura);
		return perimetro;
	}

	public double area() {
		double area = altura * largura;
		return area;
	}

	@Override
	public String toString() {
		return "Retangulo [largura=" + largura + ", altura=" + altura + "]";
	}

}
