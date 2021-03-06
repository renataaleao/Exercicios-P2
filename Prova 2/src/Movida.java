import java.util.List;

public class Movida extends Locadora {

	public Movida(List<Carro> carros) {
		super.getCarros();
	}

	@Override
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {
		double valor = 0;
		for (int i = 0; i < carros.size(); i++) {
			if (carros.get(i).getMarca().equals(carro.getMarca())
					&& carros.get(i).getModelo().equals(carro.getModelo())) {
				if (!carros.get(i).isAlugado()) {
					carro.setAlugado(true);

					if (dataInicio.getMes() > dataFim.getMes()) {
						int calculo = dataInicio.getMes() - dataFim.getMes();
						double val = calculo * 30;
						double porcentagem = (val * carro.getDiaria()) * 0.10;
						valor += val + porcentagem;
					} else if (dataInicio.getMes() < dataFim.getMes()) {
						int calculo = dataFim.getMes() - dataInicio.getMes();
						double val = calculo * 30;
						double porcentagem = (val * carro.getDiaria()) * 0.10;
						valor += val + porcentagem;
					}

					if (dataInicio.getDia() > dataInicio.getDia()) {
						int calculo = dataInicio.getMes() - dataFim.getMes();
						double porcentagem = (calculo * carro.getDiaria()) * 0.10;
						valor += porcentagem + calculo;
					} else {
						int calculo = dataFim.getMes() - dataInicio.getMes();
						double porcentagem = (calculo * carro.getDiaria()) * 0.10;
						valor += porcentagem + calculo;
					}

				}
			}
		}
		return valor;
	}

	

}
