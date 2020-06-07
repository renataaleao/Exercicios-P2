package questao2;

public class Lutador {
	
	protected String nome;
	protected int vida;
	
	public Lutador(String nome) {
		this.nome = nome;
		this.vida = 100;
	}
	
	public void socar(Lutador l) {
		l.vida -= 7;
		System.out.println(nome+ " socou: " + l.nome);
	}
	
	public void chutar(Lutador l) {
		l.vida -= 5;
		System.out.println(nome+" acabou de chutar "+ l.nome);
	}
	
	public void atirar(Lutador l) {
		l.vida -= 10;
		System.out.println(nome+" atirou "+ l.nome);
	}
	
	public void lancarMagia(Lutador l) {
		l.vida -= 12;
		System.out.println(nome+ " lançou magia em: " + l.nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	@Override
	public String toString() {
		return "Lutador: "+nome+", vida: "+vida;
	}
	
	
}
