package Tema4.relacion42;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipo1 = new Equipo("Betis");
		Equipo equipo2 = new Equipo("Sevilla");
		int opcion;
		do {
			System.out.println("OPCION");
			System.out.println("-----------------");
			System.out.println("0 Salir");
			System.out.println("1 Ver los datos de los equipos");
			System.out.println("2 Introducir los datos de un equipo");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				impEquipos(equipo1,equipo2);
				break;
			case 2:
				Partido(equipo1,equipo2);
				break;
				
				
			default:
				System.out.println("saliendo");
			}

		} while (opcion != 0);

		sc.close();
	}
	public static void Partido(Equipo equipo1,Equipo equipo2) {
		Scanner sc = new Scanner(System.in);
		int goles1=0,goles2 = 0;
		
		System.out.println(equipo1.getNombre());
		System.out.println("Introduce los goles marcados: ");
		goles1 = Integer.parseInt(sc.nextLine());
		
		System.out.println(equipo2.getNombre());
		System.out.println("Introduce los goles marcados: ");
		goles2 = Integer.parseInt(sc.nextLine());
		
		if(goles1 == goles2) {
			System.out.println("empate");
			equipo1.setPuntos(1);
			equipo2.setPuntos(1);
		} else if(goles1 > goles2) {
			System.out.println("victoria de equipo 1 ");
			equipo1.setPuntos(1);
		} else if(goles1 < goles2) {
			System.out.println("victoria de equipo 2 ");
			equipo2.setPuntos(1);
		}
		sc.close();
	}
	//dejame usar array D:
	public static void impEquipos(Equipo equipo1, Equipo equipo2) {
		System.out.println(equipo1);
		System.out.println(equipo2);
		System.out.println();
	}

}
