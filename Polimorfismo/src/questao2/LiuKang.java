package questao2;

public class LiuKang extends Lutador {

	public LiuKang() {
		super("LiuKang");
	}
	
	
	public void chutar(Lutador l) {
		super.socar(l);
		l.vida -= 9;
		System.out.println(l.nome+" acabou de chutar "+ l.nome);
	}
	
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 8;
		System.out.println(l.nome+ " lançou magia em: " + l.nome);
	}
}
