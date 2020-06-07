package questao1;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	public static void main(String[] args) {
		List<Animal> jaulas = new ArrayList<Animal>();
		
		Cachorro animal1 = new Cachorro("Mimosa", 2);
		jaulas.add(animal1);
		
		Cavalo animal2 = new Cavalo("Trovão", 10);
		jaulas.add(animal2);
		
		Preguica animal3 = new Preguica("Pri", 15);
		jaulas.add(animal3);
		
		Cachorro animal4 = new Cachorro("Rex", 8);
		jaulas.add(animal4);
		
		for (int i = 0; i < jaulas.size(); i++) {
			Animal animal = jaulas.get(i);
			if (animal instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animal;
				cachorro.correr();
			} else if (animal instanceof Cavalo) {
				Cavalo cavalo = (Cavalo) animal;
				cavalo.correr();
			} else if (animal instanceof Preguica) {
				Preguica preguica = (Preguica) animal;
				preguica.escalarArvore();
			}
		}
		


		
	}
}
