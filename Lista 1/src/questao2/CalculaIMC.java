package questao2;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		pessoa.setNome(nome);
		System.out.println("Sexo: ");
		String sexo = teclado.nextLine();
		pessoa.setSexo(sexo);
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		pessoa.setIdade(idade);
		System.out.println("Digite sua altura: ");
		double altura = teclado.nextDouble();
		pessoa.setAltura(altura);
		System.out.println("Digite seu peso: ");
		double peso = teclado.nextDouble();
		pessoa.setPeso(peso);
		
		System.out.println(pessoa.toString());
		teclado.close();
		

	}

}
