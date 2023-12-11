package tema3.relacion31;

import java.util.Scanner;

public class ej2 {
	/*
	 * Escribe un programa que pida por teclado un día de 
	 * la semana y que diga qué módulo/asignatura toca a primera 
	 * hora ese día.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Que dia es hoy: ");
		String Entry=sc.nextLine();
		if(Entry.equals("Lunes"))
			System.out.println("Toca programacion");
		else if(Entry.equals("Toca lenguaje de marcas"))
			System.out.println("Toca base de datos");
		else if(Entry.equals("Miercoles"))
			System.out.println("Toca base de datos");
		else if(Entry.equals("Jueves"))
			System.out.println("Toca algo");
		else if(Entry.equals("Viernes"))
			System.out.println("no acertaste");
		
		sc.close();
	}

}
