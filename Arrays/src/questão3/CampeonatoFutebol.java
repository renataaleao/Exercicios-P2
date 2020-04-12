package questão3;

import java.util.Arrays;

public class CampeonatoFutebol {
	
	String[] times;
	
	void adicionarTimes(String times) {
		this.times = times.split(" ");
	}
	
	String[] criarCampeonato() {
		int qtdadeJogos = (this.times.length - 1) * 2;
		String[] campeonato = new String[qtdadeJogos];
		
		int iCampeonato = 0;
		for (int iTimeCasa = 1; iTimeCasa < times.length - 1; iTimeCasa++) {
			String timeCasa = times[iTimeCasa];
			for (int iForaCasa = iTimeCasa+1; iForaCasa < times.length; iForaCasa++) {
				String timeFora = times[iForaCasa];
				
				campeonato[iCampeonato] = timeCasa + " X " + timeFora;
				iCampeonato++;
			}
		}
		return campeonato;
	}
	
	public static void main(String[] args) {
		CampeonatoFutebol camp = new CampeonatoFutebol();
		
		camp.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		
		String[] jogos = camp.criarCampeonato();
		for (int i = 0; i < jogos.length; i++) {
			System.out.println(Arrays.toString(jogos));
		
		}
		
	}
}
