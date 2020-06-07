package questao2;

public class SubZero extends Lutador {

	public SubZero() {
		super("SubZero");
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 8;
		System.out.println(l.nome+ " lançou magia em: " + l.nome);
	}

}
