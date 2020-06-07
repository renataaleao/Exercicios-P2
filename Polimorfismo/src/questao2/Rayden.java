package questao2;

public class Rayden extends Lutador{

	public Rayden() {
		super("Rayden");
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 9;
		System.out.println(l.nome+ " lançou magia em: " + l.nome);
	}
	
	
}
