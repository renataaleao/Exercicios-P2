import Enums.Carboidrato;
import Enums.Proteina;

public class Refeicao implements Item {
	
	private Proteina proteina;
	private Carboidrato carboidrato;
	//private double desconto;
	
	
	public Refeicao(Proteina proteina, Carboidrato carboidrato) {
		this.proteina = proteina;
		this.carboidrato = carboidrato;
		//this.desconto = 0.2;
	}
	
	@Override
	public double getPreco() {
		return proteina.getCusto() + carboidrato.getCusto();
	}

	@Override
	public String getDescricao() {
		return proteina.name() + " com " + carboidrato.name();
	}
	
	public Proteina getProteina() {
		return proteina;
	}
	
	public Carboidrato getCarboidrato() {
		return carboidrato;
	}

}
