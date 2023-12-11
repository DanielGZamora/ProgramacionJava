package buclesRepaso;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		String c = "abuela",ci="";
		

		Scanner sc = new Scanner(System.in);
		
		for (int i = 2; i >= 0; i--) {
			System.out.print("Dame la contraseña: ");
			ci = sc.nextLine();
			if(ci.equals(c)) {
				System.out.println("lo has logrado");
				break;
			
			} else if(i==0) {
				System.out.println("no te quedan mas intentos");
			}
			else {
				System.out.printf("Contraseña incorrecta, te quedan %d intentos \n",i);
			}
		}
		sc.close();
	}
	
}
