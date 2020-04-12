package questão2;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	List<String> procurados = new ArrayList <String>();
	
	public void addProcurados(String nomes) {
		procurados.add(nomes);
	}
	
	public boolean ehProcurado(String nome) {
		boolean achouProcurado = false;
		for (int i = 0; i < procurados.size(); i++) {
			if(procurados.contains(nome)) {
				achouProcurado = true;
			}
		} return achouProcurado;
	}
}
