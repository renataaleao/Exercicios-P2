package questao2;

import java.util.Random;

public class MortalKombate {

	private Lutador lutador1, lutador2;

	public MortalKombate(Lutador lutador1, Lutador lutador2) {
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
		fight();
	}

	public void fight() {
		while (lutador1.getVida() > 0 || lutador2.getVida() > 0) {

			Random aleatorio = new Random();
			int jogador = aleatorio.nextInt(2);

			Random ataqueSort = new Random();
			int ataque = ataqueSort.nextInt(2);

			@SuppressWarnings("unused")
			Lutador jogadorDaVez;

			switch (jogador) {

			case 0:

				jogadorDaVez = lutador1;

				if (lutador1.getNome().equals("Jax")) {
					lutador1.chutar(lutador2);
				} 
				else if (lutador1.getNome().equals("NightWolf")) {
					if (ataque == 0) {
						lutador1.atirar(lutador2);
					} else if (ataque == 1) {
						lutador1.lancarMagia(lutador2);
					}
				}

				else if (lutador1.getNome().equals("SubZero")) {
					lutador1.lancarMagia(lutador2);
				}

				else if (lutador1.getNome().equals("Rayden")) {
					lutador1.lancarMagia(lutador2);
				}

				else if (lutador1.getNome().equals("LiuKang")) {

					if (ataque == 0) {
						lutador1.chutar(lutador2);
					} else if (ataque == 1) {
						lutador1.lancarMagia(lutador2);
					}
				}

				else if (lutador1.getNome().equals("Sônia")) {

					if (ataque == 0) {
						lutador1.chutar(lutador2);
					} else if (ataque == 1) {
						lutador1.socar(lutador2);
					}
				}

				break;

			case 1:

				jogadorDaVez = lutador2;

				if (lutador2.getNome().equals("Jax")) {
					lutador2.socar(lutador1);
				}

				else if (lutador2.getNome().equals("NightWolf")) {

					if (ataque == 0) {
						lutador2.atirar(lutador1);

					} else if (ataque == 1) {
						lutador2.lancarMagia(lutador1);
					}
				}

				else if (lutador2.getNome().equals("SubZero")) {
					lutador2.lancarMagia(lutador1);
				}

				else if (lutador2.getNome().equals("Rayden")) {
					lutador2.lancarMagia(lutador1);
				}

				else if (lutador2.getNome().equals("LiuKang")) {

					if (ataque == 0) {
						lutador2.chutar(lutador1);
					} else if (ataque == 1) {
						lutador2.lancarMagia(lutador1);
					}

				}

				else if (lutador2.getNome().equals("Sônia")) {

					if (ataque == 0) {
						lutador2.chutar(lutador1);

					} else if (ataque == 1) {
						lutador2.socar(lutador1);
					}
				}

				break;
			}
		}
	}

	public String fimFight() {
		String vencedor;
		if (lutador1.getVida() < 0) {
			vencedor = lutador1.getNome();
		} else  {
			vencedor = lutador2.getNome();
		}
		return vencedor;
	}	
	
	public static void main(String[] args) {

		Lutador l1 = new Lutador("LiuKang");
		Lutador l2 = new Lutador("NightWolf");

		MortalKombate luta1 = new MortalKombate(l1, l2);
		String vencedor = luta1.fimFight();

		System.out.println("O vencedor da partida foi: " + vencedor);
	}
}


