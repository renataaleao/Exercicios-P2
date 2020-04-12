package questão2;

public class Classificados {
	
	public static void main(String[] args) {
		Imovel casa1 = new Imovel("casa", "imobiliaria falcao", 3, 1, 2, 120, true, false, false);
		
		Imovel apto1 = new Imovel("apto", "imobiliaria falcao", 15, 8, 3, 2, 3, 82, false, true, false);
		
		Imovel casa2 = new Imovel("casa", "Imobiliária Altaman", 4, 2, 3, 240, true, true, true);
		
		Imovel casa3 = new Imovel("casa", "Imobiliaria Leblon", 6, 3, 5, 540, true, true, true);
		
		Imovel apto2 = new Imovel("apto", "Imobiliária Alto Branco", 3, 2, 2, 1, 2, 60, true, true, false);
		
		System.out.println(casa1);
		System.out.println("\n");
		System.out.println(apto1);
		System.out.println("\n");
		System.out.println(casa2);
		System.out.println("\n");
		System.out.println(casa3);
		System.out.println("\n");
		System.out.println(apto2);
	}
}
