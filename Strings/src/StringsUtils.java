import java.util.Arrays;

public class StringsUtils {
	
	//FORMATA ATRIBUTOS
	public static String formataAtributo(String atributo) {
		String[] palavras = atributo.split(" ");
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < palavras.length; i++) {
			if(i == 0) {
				buffer.append(palavras[0]);
			}
			else {
				buffer.append(palavras[i].substring(0, 1).toUpperCase()+palavras[i].substring(1));
			}
		}
		return buffer.toString();
	} 
	
	//FORMATA METODOS
	public static String formataMetodo(String metodo) {
		String[] palavras = metodo.split(" ");
		StringBuilder buffer = new StringBuilder();
		for (int i = 0 ; i<palavras.length ; i++) {
			if (i==0) {
				buffer.append("get" + palavras[0].substring(0,1).toUpperCase()+palavras[0].substring(1));
			}
			else {
				buffer.append(palavras[i].substring(0,1).toUpperCase()+palavras[i].substring(1));				
			}
		}
		return buffer.toString();
	}
	
	//FORMATA CLASSES
	public static String formataClasse(String classe) {
		String[] palavras = classe.split(" ");
		StringBuilder buffer = new StringBuilder();
		for (int i = 0 ; i<palavras.length ; i++) {
			buffer.append(palavras[i].substring(0,1).toUpperCase()+palavras[i].substring(1));
		}
		return buffer.toString();
	}
	
	//ORDENA STRINGS
	@SuppressWarnings("unused")
	public static String ordenaString(String palavra1, String palavra2) {
		String palavra;
		String palavraum = palavra1.compareTo(palavra2) < 0? palavra1 : palavra2;
		String palavradois = palavra1.compareTo(palavra2) > 0? palavra1 : palavra2;
		return palavra = String.join(" ", palavraum, palavradois);
	} 
	
	//� PALINDROMO
	public static boolean ehPalindromo(String palavra) {
		String saida = "";
		boolean ehPalindromo = false;
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			saida += palavra.charAt(i);
		}
		if(saida.equals(palavra)) {
			ehPalindromo = true;
		} else {
			ehPalindromo = false;
		}
		return ehPalindromo;
	}
	
	//CAIXA ALTA
	public static String transfomaParaCaixaAlta (String palavra) {
		return palavra.toUpperCase();
	}
	
	//CONTA VOGAIS
	public static int contaVogais(String palavra) {
		char vogais = 0;
		palavra.toLowerCase();
		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				vogais++;
			}
		}
		return vogais;
	}
	
	//REMOVE ESPA�OS SURPEFLUOS
	public static String removeEspacosSuperfluos(String frase) {
		return frase.trim();
	}
	
	//OCORRENCIAS
	public static String ocorrencias(String frase, String subPalavra) {
		int[] pos = new int[subPalavra.length()];
		int contador = 0;
		int comeco = 0;
		while(frase.indexOf(subPalavra,comeco) > 0 ){
				pos[contador] = frase.indexOf(subPalavra,comeco) ;	
				contador++;
				comeco = frase.indexOf(subPalavra,comeco) + subPalavra.length();
		}
		
		return Arrays.toString(pos);
	}
	
	public static int binarioPraDecimal(String binario) {
		int potencia = 0;
		int somaDecimal = 0;
		for (int i = binario.length() - 1; i >= 0; i--) {
			somaDecimal += Math.pow(2, potencia) * Character.getNumericValue(binario.charAt(i));
			potencia++;
		}
		return somaDecimal;
	}
	
	//QUANTIDADE DE PALAVRAS
	public static int qtdDePalavras(String frase) {
		return frase.split(" ").length;
	}
	
	//HISTOGRAMA
	public static String histogramaLetras(String texto) {
		int tamanhoAlfabeto = 'z' - 'a' + 1;
		int[] histograma = new int[tamanhoAlfabeto];
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if('a' <= letra && letra <= 'z') {
				histograma[letra - 'a']++;
			}
		}
		return Arrays.toString(histograma);
	}
	
	
	/** 
		QUEST�O 2:
	 A PRIMEIRA FORMA DE CRIAR UMA STRING � MAIS R�PIDA, POR OMITIR A CHAMADA DO CONSTRUTOR E O NEW. A SEGUNDA FORMA
	 � MAIS UTILIZADA PARA CRIARMOS UM OBJETO.
	 
	 	QUEST�O 3: 
	 
	 	QUEST�O 4:
	 SEMPRE QUE ALTERAMOS UMA STRING CRIAMOS UM NOVO OBJETO STRING E O ANTIGO VALOR CONTINUAR� OCUPANDO ESPA�O NA MEM�RIA
	 AT� SER DESCARTADO.
	 NO EXEMPLO, FOI CRIADA UMA STRING "EDUARDO", LOGO AP�S, ESSA STRING � ALTERADA PARA "EDUARDO DE" E O ANTIGO VALOR
	 ("EDUARDO") N�O EST� SENDO UTILIZADO MAS AINDA EXISTE NA MEM�RIA, NOVAMENTE ALTERAMOS A STRING, PARA O VALOR "FALC�O"
	 NESSE MOMENTO, OS VALORES "EDUARDO" E "EDUARDO DE" CONTINUAM EXISTINDO POR�M N�O EST�O SENDO UTILIZADOS. 
	 
	 	QUEST�O 5:
	 OBJETOS DE STRINGBUILDER S�O MUT�VEIS, O QUE QUER DIZER QUE N�O VAMOS CRIAR OUTROS OBJETOS QUANDO ALTERARMOS
	 O SEU VALOR E NENHUMA MEM�RIA SER� DESPERDI�ADA.
	 
	 **/
}
