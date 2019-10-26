package entities;

public class Conta {
	
	// Definição dos atributos
	private String name;
	private int number;
	private double balance;
	
	// Construtor com 3 argumentos, caso queira abrir a conta com um depósito inicial
	public Conta(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		
		// Chamada do método deposito, usando o principio de delegação
		// dessa forma ao criar uma conta vc não mexe no balanço, pois está zerado
		// Voce faz um deposito inicial
		depositar(initialDeposit);
	}
	
	// Constrtutor com dois argumentos, usando a sobrecarga
	// usado se o cliente queira abri a conta mas não queira fazer um depósito inicial
	public Conta(String name, int number) {
		this.name = name;
		this.number = number;
		
		// sabemos que em java um atributo double ele já é inicializado com o valor 0;
		// mas como boa prática de programação e pra facilitar a leitura do programa;
		// inicializamos a variável.
		balance = 0.0;

	}
	
	// Getters e setters padrão
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
	
	/* Foi retirado o método setBalance, pois não podemos deixar que
	 * o balanço seja alterado de qualquer forma, por este motivo 
	 * foi criado o método saque e deposito, para alterar o balanço
	 */
	public void depositar(double deposito)
	{
		balance += deposito;
	}
	
	public void sacar(double saque)
	{
		balance -= saque + 5.0;
	}
	
	// Método toString para facilitar a impressão do resumo da conta na tela
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
