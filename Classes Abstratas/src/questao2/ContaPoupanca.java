package questao2;

public class ContaPoupanca extends ContaBancaria {
	
	private static final double CUSTO_FIXO = 5;
	
	public ContaPoupanca(String nome, String senha, double saldo) {
		super(nome, senha, saldo);
	}

	@Override
	public void transferir(String senha, double valor, ContaBancaria conta) throws SaldoInsuficienteException, SenhaInvalidaException {
		if(saldo < valor) {
			throw new SaldoInsuficienteException();
		} 
		
		if(this.getSenha().equals(senha)) {
			saldo -= valor;
			saldo -= CUSTO_FIXO;
			conta.saldo += valor;
		} else {
			throw new SenhaInvalidaException();
		}
	}

}
