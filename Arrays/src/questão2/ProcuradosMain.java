package questão2;

public class ProcuradosMain {

	public static void main(String[] args) {
		SistemaInterpol sistema = new SistemaInterpol();
		sistema.addProcurados("Phulano Syckrano Bheltranno");
		System.out.println(sistema.ehProcurado("Bheltranno"));
	}

}
