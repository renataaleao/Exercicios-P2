package questao1;

public class Quadrado extends Quadrilatero {

	public Quadrado(double lado1, double lado2, double lado3, double lado4) {
		super(lado1, lado2, lado3, lado4);
	}

	@Override
	public double calculaArea() {
		double area = lado1 * lado1;
		return area;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = lado1 * 4;
		return perimetro;
	}

}
