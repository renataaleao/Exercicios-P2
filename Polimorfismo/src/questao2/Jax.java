package questao2;

public class Jax extends Lutador{

	public Jax() {
		super("Jax");
	}
	
	@Override
	public void socar(Lutador l) {
		super.socar(l);
		l.vida -= 10;
		System.out.println(l.nome+ " socou: " +l.nome);
	}

}
