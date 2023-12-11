package ej3;

import java.util.Date;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Date fecha = new Date();
		System.out.println(fecha);
		
		Scanner sc = new Scanner(System.in);
		String unNombre = sc.nextLine();
		
		int unDia = sc.nextInt();
		int unMes = sc.nextInt();
		int unAño = sc.nextInt();
		
		System.out.printf("Te llamas %s y naciste en el %02d-%02d-%04d\n",
				unNombre,unDia,unMes,unAño);
		sc.close();
	}

}
