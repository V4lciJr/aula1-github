package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tec = new Scanner(System.in);
		Conta conta;
		double deposit;
		
		System.out.print("Enter account number: ");
		int number = tec.nextInt();
		System.out.print("Enter account holder: ");
		tec.nextLine();
		String name = tec.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = tec.next().charAt(0);
		
		if(resp == 'y')
		{
			System.out.print("Enter initial deposit value: ");
			 deposit = tec.nextDouble();
			 conta = new Conta(name, number, deposit);
		}
		else
		{
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
		
		
		tec.close();

	}

}
