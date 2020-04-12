package questao2;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	public String calculaIMC() {
		double imc = getPeso() / (getAltura() * getAltura());
		if(imc <= 18.5) {
			return "Abaixo do peso normal";
		} else if (imc <= 25) {
			return "Peso normal";
		} else if (imc <= 30) {
			return "Acima do peso normal";
		} else {
			return "Obesidade";
		}
	}
	

	@Override
	public String toString() {
		return "Nome " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade() + "\nIndíce de Massa Corporal: " + calculaIMC();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
