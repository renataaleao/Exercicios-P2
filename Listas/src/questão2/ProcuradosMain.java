package questão2;

public class ProcuradosMain {

	public static void main(String[] args) {
		SistemaInterpol sistema = new SistemaInterpol();
		sistema.addProcurados("Phulano");
		sistema.addProcurados("Syckranno");
		sistema.addProcurados("Bheltranno");
		System.out.println(sistema.ehProcurado("Bheltranno"));
		//System.out.println(sistema.ehProcurado("fulano"));

	}

}
