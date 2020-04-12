package questão1;
import java.util.ArrayList;
import java.util.List;

public class ListasMathUtils {

	public static List<Integer> calculaDivisores(int num) {
		List<Integer> divisores = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores.add(i);
			}
		}
		return divisores;
	}

	public static double computaMaior(List<Double> numeros) {
		double maior = 0;
		for (Double numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		return maior;
	}

	public static double computaMenor(List<Double> numeros) {
		double menor = numeros.size();
		for (Double numero : numeros) {
			if (numero < menor) {
				menor = numero;
			}
		}
		return menor;
	}

	public static double computaMedia(List<Double> numeros) {
		double soma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			soma = soma + numeros.get(i);
		}
		return soma / numeros.size();
	}

	public static boolean temNumRepetido(List<Double> numeros) {
		boolean temRepetido = false;
		for (int i = 0; i < numeros.size(); i++) {
			double repetido = numeros.get(i);
			for (int j = i + 1; j < numeros.size(); j++) {
				double repete = numeros.get(j);
				if (repetido == repete) {
					temRepetido = true;
				}
			}
		}
		return temRepetido;
	}
}
