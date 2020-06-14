package questao1;

public abstract class Quadrilatero extends Figura {
	
	protected double lado1;
	protected double lado2;
	protected double lado3;
	protected double lado4;
	
	public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}

	@Override
	public abstract double calculaArea();

	@Override
	public abstract double calculaPerimetro();

}
