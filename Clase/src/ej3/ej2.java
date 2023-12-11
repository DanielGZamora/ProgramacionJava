package ej3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		Date hoy = new Date();
		SimpleDateFormat formatoAño = new SimpleDateFormat("yyyy");
		int anyoHoy = Integer.parseInt(formatoAño.format(hoy));
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica tu nombre: ");
		String unNombre = sc.nextLine();
		
		System.out.print("Indica tu fecha de nacimiento DD MM AAAA");
		int unDia = sc.nextInt();
		int unMes = sc.nextInt();
		int unAño = sc.nextInt();
		
		int YearCalc = anyoHoy - unAño;
		
		
		System.out.printf("Te llamas %s y naciste en el %02d-%02d-%04d\n",
				unNombre,unDia,unMes,unAño);
		
		System.out.println("pasaron "+ YearCalc + " años desde tu nacimiento");
		sc.close();
	}

}
