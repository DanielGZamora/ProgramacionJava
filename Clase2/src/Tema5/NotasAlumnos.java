package Tema5;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] notas = new double[10];
		double sumaNotas = 0;
		double media=0;
		
		//introducir notas
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduce la nota %d:",i+1);
			notas[i]=sc.nextDouble();
		}
		System.out.println("-------------");
		//imprimir notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota "+ (i+1)+": " +notas[i]);
		}
		//media de notas
		for (int i = 0; i < notas.length; i++) {
			sumaNotas += notas[i];
			media = sumaNotas/notas.length;
		}
		System.out.println("-------------");
		System.out.println("media: " + media);
		
		sc.close();
	}

}
