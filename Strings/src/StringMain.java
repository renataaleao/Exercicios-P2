
public class StringMain {

	public static void main(String[] args) {
		
		System.out.println(StringsUtils.formataAtributo("quantidade de questoes"));
		System.out.println(StringsUtils.formataMetodo("quantidade de questoes"));
		System.out.println(StringsUtils.formataClasse("formatador de identificadores"));
		System.out.println(StringsUtils.ordenaString("chevrolet", "fiat"));
		System.out.println(StringsUtils.ehPalindromo("arara"));
		System.out.println(StringsUtils.transfomaParaCaixaAlta("arroz"));
		System.out.println(StringsUtils.contaVogais("In God We Trust"));
		System.out.println(StringsUtils.removeEspacosSuperfluos("  Hay que endurecerse, pero sin perder la ternura jamás  "));
		System.out.println(StringsUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce"));
		System.out.println(StringsUtils.binarioPraDecimal("1100110011"));
		System.out.println(StringsUtils.qtdDePalavras("programar é muito fácil"));
		System.out.println(StringsUtils.histogramaLetras("the quick brown fox jumps over the lazy dog"));

	}

}

