package questao2;

public class Data {
	
	private int dia, mes, ano, horaInicio, horaFim;

	public Data(int dia, int mes, int ano, int horaInicio, int horaFim) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public int getHoraInicio() {
		return horaInicio;
	}
	
	public int getHoraFim() {
		return horaFim;
	}
}
