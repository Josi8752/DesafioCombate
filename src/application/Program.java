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
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int atack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champion = new Champion(name, life, atack, armor);
	
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		sc.nextLine();
		System.out.print("Vida inicial: ");
		int vidaInicial = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		champion = new Champion(nome, vidaInicial, ataque, armadura);
		champion.takeDamage(champion);
		
		
		System.out.println("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		for (int i = 0; N > i; i++) {
			champion.status();
		}
		sc.close();
	}
}
