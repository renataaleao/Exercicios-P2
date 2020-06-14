package questao2;

public class ContaCorrente extends ContaBancaria{
	
	private static final double MINIMO = 5000;
	private static final double CUSTO_MINIMO = 0.25;
	private static final double CUSTO_MAXIMO = 15;
	public ContaCorrente(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SenhaInvalidaException, SaldoInsuficienteException {
		if (getSenha() != senha) {
			throw new SenhaInvalidaException();
		} else if(saldo < valor) {
			throw new SaldoInsuficienteException();
		} else if(valor < MINIMO) {
			saldo -= (valor + CUSTO_MINIMO);
			conta.saldo += valor;
		} else if(valor >= MINIMO) {
			saldo -= (valor + CUSTO_MAXIMO);
			conta.saldo += valor;
		}
	}

}
