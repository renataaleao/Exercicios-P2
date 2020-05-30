package questao2;

import java.util.Scanner;

public class NomeInvertidoApp {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		Pessoa pessoa = new Pessoa();
		boolean errou;
		do {
			try {
				pessoa.setNome(teclado.nextLine());
				errou = false;
			} catch(NomeInvalidoException e) {
				System.out.println(e.getMessage());
				errou = true;
				System.out.print("Digite o seu nome: ");
			}
		} while (errou);
		
		System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
		teclado.close();
	}
}
