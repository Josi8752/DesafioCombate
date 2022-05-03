package application;

import java.util.Locale;
import java.util.Scanner;

import result.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion;
		
			System.out.println("Digite os dados do primeiro campeão: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Vida inicial: ");
			int vidaInicial = sc.nextInt();
			System.out.print("Ataque: ");
			int ataque = sc.nextInt();
			System.out.print("Armadura: ");
			int armadura = sc.nextInt();
			champion = new Champion(nome, vidaInicial,ataque,armadura);
			
			System.out.println();
			System.out.println("Digite os dados do primeiro campeão: ");
			System.out.print("Nome: ");
			String nome2 = sc.nextLine();
			System.out.print("Vida inicial: ");
			int vidaInicial2 = sc.nextInt();
			System.out.print("Ataque: ");
			int ataque2 = sc.nextInt();
			System.out.print("Armadura: ");
			int armadura2 = sc.nextInt();
			champion = new Champion(nome2, vidaInicial2,ataque2,armadura2);
			
			System.out.println("Quantos turnos você deseja executar? ");
			int N = sc.nextInt();
			
		 for (int i = 0; N > i; i++) {
			 System.out.printf("Resultado do turno", i, ":");
			 champion.status();
			 System.out.print(champion);
		 }
			
			
	sc.close();
	}
}	
	
