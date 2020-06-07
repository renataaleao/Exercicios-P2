package questao2;

public class Sonia extends Lutador {

	public Sonia() {
		super("Sônia");
	}
	
	public void socar(Lutador l) {
		super.socar(l);
		l.vida -= 8;
		System.out.println(l.nome+ " socou: " + l.nome);
	}
	
	public void chutar(Lutador l) {
		super.socar(l);
		l.vida -= 8;
		System.out.println(l.nome+" acabou de chutar "+ l.nome);
	}

}
