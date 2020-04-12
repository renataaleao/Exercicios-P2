package questão2;

public class SistemaInterpol {
	
	private String[] procurados = new String[10];
	
	public void addProcurados(String nomes) {
		this.procurados = nomes.split(" ");
	}
	
	public boolean ehProcurado(String nome) {
		boolean achouProcurado = false;
		for (int i = 0; i < procurados.length; i++) {
			if (nome.equals(procurados[i])) {
				achouProcurado = true;
			}
		}
		return achouProcurado;
	}
}
