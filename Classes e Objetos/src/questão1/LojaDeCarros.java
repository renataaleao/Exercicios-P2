package questão1;

public class LojaDeCarros {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Pálio", "Fiat", 35000);
		Carro carro2 = new Carro("Pálio Básico", "Fiat", "prateada", 0, false, false, false, false, 35000);
		Carro carro3 = new Carro("Civic", "Honda", "", 4 , false, false, false, false, 110000);
		Carro carro4 = new Carro("Corolla", "Toyota", "", 4, true, true, false, true, 110000);
		Carro carro5 = new Carro();
		
		//contrutor sem argumentos
		carro5.nome ="Gol";
		carro5.marca = "Volswagen";
		carro5.vidroEletrico = true;
		carro5.arCondicionado = true;
		carro5.cambioAutomatico = true;
		carro5.direcaoEletrica = true;
		carro5.precoBase = 55000;
		
		System.out.println(carro1);
		System.out.println("\n");
		System.out.println(carro2);
		System.out.println("\n");
		System.out.println(carro3);
		System.out.println("\n");
		System.out.println(carro4);
		System.out.println("\n");
		
		System.out.println("nome: " + carro5.nome); 
		System.out.println("marca: " + carro5.marca); 
		System.out.println("vidro elétrico: " + carro5.vidroEletrico);
		System.out.println("ar condicionado: "+carro5.arCondicionado); 
		System.out.println("Cambio Automático: "+carro5.cambioAutomatico);
		System.out.println("Direção elétrica: "+carro5.direcaoEletrica); 
		System.out.println("Preço: "+carro5.precoBase);
		
	}

}
