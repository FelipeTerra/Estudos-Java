package Entidades;

public class Conta {
	
	
	private int conta;
	private String nome;
	private double saldo;
	
	public Conta(int conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public Conta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valor) {
		saldo +=  valor;		
	}
	
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	public String toString () {
		return "----------------- Dados da Conta ----------------- \n"
				+ "- Número da Conta: " + conta + "\n"
				+ "- Nome: " + nome + "\n"
				+ "- Saldo: " + saldo + "\n";

	}

}
