package tema4.practica41;

public class PruebaAutobus {
	
	public static void main(String[] args) {
		
		Autobus bus1 = new Autobus("238u984", "Granada-Sevilla", "15/12/2003 8:00", 50);
		Autobus bus2 = new Autobus("983k945", "Huelva-Malaga", "15/12/2003 10:00", 70);
		Autobus bus3 = new Autobus("293f126", "Cordoba-Cadiz", "15/12/2003 11:30", 50);
		
		bus1.reservarAsiento(30);
		bus1.reservarAsiento(20);
		bus2.reservarAsiento(50);
		bus3.reservarAsiento(10);
		bus3.reservarAsiento(41);
		
		bus1.cancelarAsiento(10);
		bus2.cancelarAsiento(30);
		bus3.cancelarAsiento(11);
		
		impBus(bus1,1);
		impBus(bus2,2);
		impBus(bus3,3);
	
	}
	public static  void impBus(Object bus, int numero){
		System.out.println("------------------------------------------");
		System.out.printf("bus %d:", numero);
		System.out.println(bus);
		}
	
}
