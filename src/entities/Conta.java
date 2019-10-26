package entities;

public class Conta {
	
	// Defini��o dos atributos
	private String name;
	private int number;
	private double balance;
	
	// Construtor com 3 argumentos, caso queira abrir a conta com um dep�sito inicial
	public Conta(String name, int number, double initialDeposit) {
		this.name = name;
		this.number = number;
		
		// Chamada do m�todo deposito, usando o principio de delega��o
		// dessa forma ao criar uma conta vc n�o mexe no balan�o, pois est� zerado
		// Voce faz um deposito inicial
		depositar(initialDeposit);
	}
	
	// Constrtutor com dois argumentos, usando a sobrecarga
	// usado se o cliente queira abri a conta mas n�o queira fazer um dep�sito inicial
	public Conta(String name, int number) {
		this.name = name;
		this.number = number;
		
		// sabemos que em java um atributo double ele j� � inicializado com o valor 0;
		// mas como boa pr�tica de programa��o e pra facilitar a leitura do programa;
		// inicializamos a vari�vel.
		balance = 0.0;

	}
	
	// Getters e setters padr�o
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
	
	/* Foi retirado o m�todo setBalance, pois n�o podemos deixar que
	 * o balan�o seja alterado de qualquer forma, por este motivo 
	 * foi criado o m�todo saque e deposito, para alterar o balan�o
	 */
	public void depositar(double deposito)
	{
		balance += deposito;
	}
	
	public void sacar(double saque)
	{
		balance -= saque + 5.0;
	}
	
	// M�todo toString para facilitar a impress�o do resumo da conta na tela
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
