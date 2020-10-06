package classe;

public class Conta {

	private String nome;
	private int idade;
	private long numConta;
	private double saldo;
	
	
	
	public Conta(String nome, int idade, long numConta) {
		this.nome = nome;
		this.idade = idade;
		this.numConta = numConta;
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

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double deposito(double saldo) {
		return this.saldo += saldo;
	}

	public double saque(double saldo) {
		return this.saldo -= saldo;
	}
	
	public String consultarSaldo() {
		return "Extrato: "
				+saldo;
	}
	
	public String consultarDados() {
		return "Nome: " + nome + "\n" +
				"Numero da conta: " + numConta + "\n" +
				"Tipo da conta: ";
	}
	

}
