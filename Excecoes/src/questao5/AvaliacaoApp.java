package questao5;

import java.util.Scanner;

public class AvaliacaoApp {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Avaliacao avaliacao = new Avaliacao();
		
		boolean nota10k = false;
		boolean nota20k = false;
		while (nota10k == false )
		{	System.out.print("Digite nota do estágio 1: ");
			try {
				avaliacao.setNota1(teclado.nextDouble());
				nota10k = true;
			} catch (NotaInvalidaException e)
				{	System.out.println(e.getMessage());
				}
		}
		while (nota20k == false)
		{	System.out.print("Digite nota do estágio 2: ");
			try {
				avaliacao.setNota2(teclado.nextDouble());
				nota20k = true;
			} catch (NotaInvalidaException e)
				{	System.out.println(e.getMessage());
				}
		}
		System.out.println("Média: " + avaliacao.getMedia());
		teclado.close();
	}
}
