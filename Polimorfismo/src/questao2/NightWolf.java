package questao2;

public class NightWolf extends Lutador{

	public NightWolf() {
		super("NightWolf");
	}
	
	@Override
	public void atirar(Lutador l) {
		l.atirar(l);
		l.vida -= 5;
		System.out.println(l.nome+" atirou "+ l.nome);
	}
	
	@Override
	public void lancarMagia(Lutador l) {
		l.lancarMagia(l);
		l.vida -= 6;
		System.out.println(l.nome+ " lançou magia em: " + l.nome);
	}
	
	
	
}
