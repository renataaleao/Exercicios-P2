package questao1;

public class Trapezio extends Quadrilatero {
	
	private double altura;
	
	public Trapezio(double lado1, double lado2, double lado3, double lado4, double altura) {
		super(lado1, lado2, lado3, lado4);
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		double area = (lado1 + lado2) * altura / 2;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = (lado1 + lado2) * altura / 2;
		return perimetro;
	}

}
