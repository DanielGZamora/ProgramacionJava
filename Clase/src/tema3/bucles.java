package tema3;

import java.util.Scanner;

public class bucles {

	public static void ElWhile(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la palabra secreta: ");
		String palabra = sc.nextLine();
		
		while(!palabra.equalsIgnoreCase("daw")) {
			System.out.println("Incorrecto");
			
			System.out.println("Dime la palabra secreta: ");
			palabra = sc.nextLine();
		}
		System.out.println("mu bien");
		sc.close();
	}
	public static void ElDoWhile(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la palabra secreta: ");
		String palabra = sc.nextLine();
		do {
			System.out.println("Incorrecto");
			System.out.println("Dime la palabra secreta: ");
			palabra = sc.nextLine();
		}while(!palabra.equalsIgnoreCase("daw")); 
		System.out.println("mu bien");
		sc.close();
	}
	public static void ElFor(String[] args) {
		for (int i = 1; i < 5; i++) {
		
			
		}
		
	}

}
