package application;

import java.util.Locale;
import java.util.Scanner;

import application.entities.Champion;

public class CombatProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion champ1, champ2;
		String name;
		int iniLife;
		int attack;
		int armor;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		iniLife = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		champ1 = new Champion(name, iniLife, attack, armor);
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		iniLife = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		System.out.println();
		
		champ2 = new Champion(name, iniLife, attack, armor);
		
		int numberOfShifts;
		
		System.out.print("Quantos turnos você deseja executar? ");
		numberOfShifts = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < numberOfShifts; i++) {
			champ2.takeDamage(champ1);
			champ1.takeDamage(champ2);
			
			System.out.printf("Resultado do turno %d:%n", i + 1);
			System.out.printf("%s: %s%n", champ1.getName(), champ1.status());
			System.out.printf("%s: %s%n", champ2.getName(), champ2.status());
			System.out.println();
			
			if (champ1.getLife() * champ2.getLife() == 0)
				i = numberOfShifts;
		}
		
		System.out.println("FIM DO COMBATE");
		sc.close();
	}
}
