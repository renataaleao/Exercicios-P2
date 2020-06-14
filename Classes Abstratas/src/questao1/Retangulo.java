package questao1;

public class Retangulo extends Quadrilatero {

	public Retangulo(double lado1, double lado2, double lado3, double lado4) {
		super(lado1, lado2, lado3, lado4);
	}

	@Override
	public double calculaArea() {
		double area = lado1 * lado2;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * (lado1 + lado2);
		return perimetro;
	}

}
