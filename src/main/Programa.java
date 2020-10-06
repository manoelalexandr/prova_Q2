package main;

import java.util.Scanner;

import classe.Conta;


public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int operacao = 0;
		String op = "conta";
		System.out.println("Vamos criar uma conta");
		System.out.println("Informe seu Nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe o numero da conta:");
		long num = sc.nextLong();
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		Conta conta = new Conta(nome ,idade, num);	


		System.out.println("Qual tipo de conta voce deseja criar? (1- poupanca/ 2 - corrente)");
		int tipo = sc.nextInt();
		
		if (tipo == 1) {
			conta.setSaldo(50.0);
			 op = "Poupança";
		}else if (tipo == 2) {
			conta.setSaldo(100.0);
			 op = "Corrente";
		}
			while (operacao != 5) {
				System.out.println("Qual operação deseja realizar?");
				System.out.println("1 - Deposito");
				System.out.println("2 - Saque");
				System.out.println("3 - Consultar Saldo");
				System.out.println("4 - Consultar Dados");
				System.out.println("5 - Sair");
				operacao = sc.nextInt();

				if (operacao == 1) {
					System.out.println("Qual valor sera depositado?");
					conta.deposito(sc.nextDouble());
					
				} else if (operacao == 2) {
					System.out.println("Qual valor sera sacado?");
					conta.saque(sc.nextDouble());	
					
				}else if (operacao == 3) {
					System.out.println(conta.consultarSaldo());
					
				}else if (operacao == 4) {
					System.out.println(conta.consultarDados() + op);
					
				}else if(operacao == 5) {
					System.out.println("Operação Finalizada");
				}
				
			}
		

		sc.close();

	}

}
