package entities;

public class Conta {

	private String name;
	private int number;
	private double balance;
	
	
	public Conta(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		depositar(initialDeposit);
	}

	public Conta(String name, int number) {
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void depositar(double deposito)
	{
		balance += deposito;
	}
	
	public void sacar(double saque)
	{
		balance -= saque + 5.0;
	}
	
	public String toString()
	{
		return "Account "
				+ number + ","
				+ " Holder: " 
				+name 
				+ ", Balance: $ " 
				+ String.format("%.2f%n", balance);
	}
}
