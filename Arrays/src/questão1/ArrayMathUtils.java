package questão1;

public class ArrayMathUtils {
	
	private static int qtdDivisores(int num) {
		int divisores = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				divisores++;
			}
		} 
		return divisores;
	}
	
	public static int[] calculaDivisores(int num) {
		int tamanho = ArrayMathUtils.qtdDivisores(num);
		int[] divisores = new int[tamanho];
		int contador = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divisores[contador] = i;
				contador++;
			}
		}
		return divisores;
		
	}
	
	public static double computaMaior(double[] numeros) {
		double maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	public static double computaMenor(double[] numeros) {
		double menor = numeros.length;
		for (int i = 1; i < numeros.length; i++) {
			if ( numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}
	
	public static double computaMedia(double[] numeros) {
		double soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}
		return soma/numeros.length;
	}
	
	public static boolean temNumRepetido(double[] numeros) {
		boolean temRepeticao = false;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if(numeros[i] == numeros[j]) {
					temRepeticao = true;
				}
			}
		}
		return temRepeticao;
	}
	
	public static int[][] somaMatrizes(int[][] m1, int[][] m2){
		int [][] soma = new int[m1.length][];
		
		// quantas colunas a linha 0 de m1 possui
		for (int linha = 0; linha < m1.length; linha++) {
			
			int colunas = m1[linha].length;
			// instancia da linha (no indice "linha") 
			soma[linha] = new int [colunas];
			
			for (int coluna = 0; coluna < colunas; coluna++) {
				soma[linha][coluna] = m1[linha][coluna] + m2[linha][coluna];
				
			}
		} return soma;
	}
	
	// metodo para formatar a saida da soma das matrizes
		public static String ArrayBidimesional(int [][] array) {
			String saida = "";
			
			for (int linha = 0; linha < array.length; linha++) {
				for (int coluna = 0; coluna < array[linha].length; coluna++) {
					saida +=  array[linha][coluna] + " " ;				
				}
				saida += "\n";
			} return saida;
		}
	
}