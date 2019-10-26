package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		// função que aceita que valores do tipo double sejam separados por ponto 
		Locale.setDefault(Locale.US);
		
		// Declaração de variável para entrada e leitura de dados
		Scanner tec = new Scanner(System.in);
		
		// Definição dos atributos
		Conta conta;
		double deposit;
		
		// Lendo os dados 
		System.out.print("Enter account number: ");
		int number = tec.nextInt();
		System.out.print("Enter account holder: ");
		tec.nextLine();
		String name = tec.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = tec.next().charAt(0);
		
		// Condicional que define como o cliente quer abrir a conta
		if(resp == 'y')
		{
			// Se quer entrar com um deposito inicial
			System.out.print("Enter initial deposit value: ");
			 deposit = tec.nextDouble();
			 
			 // instaciando a conta com o construtor de 3 argumentos
			 conta = new Conta(name, number, deposit);
		}
		else
		{	
			 // caso o cliente não queira um depósito inicial
		     // Instancia a conta com o construtor de dois argumentos 
			 conta = new Conta(name, number);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.print("Enter deposit value: ");
		deposit = tec.nextDouble();
		conta.depositar(deposit);
		
		System.out.println("Update account data: ");
		System.out.println(conta);
		System.out.println("");
		
		System.out.print("Enter withdraw value: ");
		double saque = tec.nextDouble();
		conta.sacar(saque);
		System.out.println("Update account data: ");
		System.out.println(conta);
		System.out.println("Thank you so much for using our bank, check back often !!");
		
		
		tec.close();

	}

}
