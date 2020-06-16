import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Locadora implements LocadoraCarros{
	
	protected List<Carro> carros;
	
	public Locadora() {
		this.carros = new ArrayList<Carro>();
	}
	
	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		Carro carro = new Carro(modelo, marca, ano, diaria);
		carros.add(carro);
	}
	
	@Override
	public List<Carro> listarCarrosDaMarca(String marca) {
		List<Carro> carrosDaMarca = new ArrayList<Carro>();
		for (int i = 0; i < carros.size(); i++) {
			if(carros.get(i).getMarca().equals(marca)) {
				carrosDaMarca.add(carros.get(i));
			}
		}
		return carrosDaMarca;
	}
	
	@Override
	public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException{
		Iterator<Carro> it = carros.iterator();
		while(it.hasNext()) {
			Carro car = it.next();
			if(car.getModelo().equals(modelo) && car.getMarca().equals(marca) && car.getAno() == ano) {
				it.remove();
			}
		}
	}
	
	public List<Carro> getCarros() {
		return carros;
	}
	
	
}
