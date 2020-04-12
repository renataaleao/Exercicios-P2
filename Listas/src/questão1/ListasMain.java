package questão1;
import java.util.ArrayList;
import java.util.List;

public class ListasMain {

	public static void main(String[] args) {
		List<Double> numeros = new ArrayList<Double>();
		numeros.add(12.4);
		numeros.add(43.1);
		numeros.add(4.3);
		numeros.add(54.0);
		numeros.add(6.7);
		// numeros.add(6.7);

		System.out.println(ListasMathUtils.calculaDivisores(12));
		System.out.println(ListasMathUtils.computaMaior(numeros));
		System.out.println(ListasMathUtils.computaMenor(numeros));
		System.out.println(ListasMathUtils.computaMedia(numeros));
		System.out.println(ListasMathUtils.temNumRepetido(numeros));

	}

}
