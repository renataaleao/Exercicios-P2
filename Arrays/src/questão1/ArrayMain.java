package quest�o1;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {

		int[] divisores = ArrayMathUtils.calculaDivisores(15);
		System.out.println(Arrays.toString(divisores));
		double[] numeros = {12.4, 43.1, 4.3, 54.0, 6.7 };
		System.out.println(ArrayMathUtils.computaMaior(numeros));
		System.out.println(ArrayMathUtils.computaMenor(numeros));
		System.out.println(ArrayMathUtils.computaMedia(numeros));
		System.out.println(ArrayMathUtils.temNumRepetido(numeros));

		int[][] m1 = new int[][] { new int[] { 5, 4 }, new int[] { 0, 2 }, new int[] { 1, -1 } };
		int[][] m2 = new int[][] { new int[] { 0, -2 }, new int[] { 5, -3 }, new int[] { -1, 0 } };
		int[][] soma = ArrayMathUtils.somaMatrizes(m1, m2);
		System.out.println(ArrayMathUtils.ArrayBidimesional(soma));
	}

}
