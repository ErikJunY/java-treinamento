package entities;

public class Conta {
	
	private int number;
	private String nome;
	private double saldo;
	
	public Conta(int number, String nome) {
		this.number = number;
		this.nome = nome;
	}
	
	public Conta(int number, String nome, double depositoInicial) {
		this.number = number;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public int getNumber() {
		return number;
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
	
	public void deposito(double deposito) {
		saldo += deposito;
		
	}
	public void saque(double saque) {
		saldo -= saque + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ this.number
				+ ", Holder: "
				+ this.nome
				+ ", Balance: $"
				+ String.format("%.2f",this.saldo);
	
	}
}
