package tema4.practica41;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Autobus bus1 = new Autobus("238u984", "Granada-Sevilla", "15/12/2003 8:00", 50);
		Autobus bus2 = new Autobus("983k945", "Huelva-Malaga", "15/12/2003 10:00", 70);
		Autobus bus3 = new Autobus("293f126", "Cordoba-Cadiz", "15/12/2003 11:30", 50);
		
		//probando a usar arrays
		
		/**
		 * crear objeto
		 */
		/*
		 */
		Autobus[] bus = new Autobus[3];
		for (int i = 0; i < bus.length; i++) {
			bus[i] = new Autobus(null, null, null, 0);
		}
		/**
		 * imprimir objeto
		 */
		for (int i = 0; i < bus.length; i++) {
			bus[i] = infoBus(bus);
		}
		
		
		sc.close();
		
		
		impBus(bus);
		
		bus1.reservarAsiento(30);
		bus1.reservarAsiento(20);
		bus2.reservarAsiento(50);
		bus3.reservarAsiento(10);
		bus3.reservarAsiento(41);
		
		
		bus1.cancelarAsiento(10);
		bus2.cancelarAsiento(30);
		bus3.cancelarAsiento(11);
	
	}
	//Prueba con arrays
	public static  void impBus(Object bus[]){
		for (int i = 0; i < 3; i++) {
				System.out.println("------------------------------------------");
				System.out.printf("bus %d:",i);
				System.out.println(bus);
			}
		}
	public static void infoBus(Autobus bus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este es el bus "+bus);
		System.out.println("Introduce la matricula del bus");
		bus.setMatricula(sc.next());
		
		System.out.println("Introduce la ruta del bus");
		bus.setRuta(sc.next());
		
		System.out.println("Introduce la fecha del bus");
		bus.setFechaHora(sc.next());
		
		System.out.println("Introduce los asientos del bus");
		bus.setAsientos(sc.nextInt());
		
		sc.close();
		
	
	}
}
