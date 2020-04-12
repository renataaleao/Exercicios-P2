package questão1;

import java.util.Scanner;

public class RetanguloApp {
	
		public static void main(String[] args) {		
			Scanner teclado = new Scanner(System.in);
			System.out.print("Digite a altura: ");
			Retangulo retangulo = new Retangulo();
			double altura = teclado.nextDouble();
			retangulo.setAltura(altura);
			double alturaa = retangulo.getAltura();
			System.out.print("Digite a largura: ");
			double largura = teclado.nextDouble();
			retangulo.setLargura(largura);
			double larguraa = retangulo.getLargura();
			System.out.println("Área do retângulo: " +retangulo.area());
			System.out.println("Perímetro do retângulo: " +retangulo.perimetro());
			teclado.close();
		
		}
}
