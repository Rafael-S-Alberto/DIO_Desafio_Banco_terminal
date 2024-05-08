package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		// --- Variáveis ---
		int numero=0;
		double saldo=0.0;
		String agencia ="", nomeCliente="";
		// --- Permitindo Entrada de Dados
		Scanner input = new Scanner(System.in);
		
		System.out.println("Olá, seja bem vindo ao Banco DIO.");
		System.out.println("Vamos iniciar sua abertura de conta.\n");
		System.out.println("Para começarmos, por favor, insira seu nome");
		nomeCliente = input.nextLine();
		System.out.println("");
		
		System.out.println("Agora insira qual o código da agência desejada");
		agencia = input.nextLine();
		System.out.println("");
		
		System.out.println("Insira qual o número da agência");
		numero = input.nextInt();
		System.out.println("");
		
		System.out.println("Por fim, insira o saldo que deseja depositar inicialmente");
		saldo = input.nextDouble();
		System.out.println("");
		
		System.out.println("------------------");
		
		System.out.println("Olá " +nomeCliente+ 
				", obrigado por criar uma conta em nosso banco, sua agência é: " 
				+agencia+ ", de conta número: " +numero+ ", e seu saldo inicial de R$"
				+saldo+ " já está disponível para saque!");
		
		
		
	}
}
