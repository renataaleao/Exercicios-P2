import Enums.SaborBebida;
import Enums.Tamanho;

public class Bebida implements Item {
	
	protected Tamanho tamanho;
	protected SaborBebida sabor;
	
	public Bebida(Tamanho tamanho, SaborBebida sabor) {
		this.tamanho = tamanho;
		this.sabor = sabor;
	}
	
	public Tamanho getTamanho() {
		return tamanho;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}

	@Override
	public double getPreco() {
		return sabor.getCusto() + tamanho.getCusto();
	}

	@Override
	public String getDescricao() {
		return sabor.name() + " / " + tamanho.name();
	}

}
