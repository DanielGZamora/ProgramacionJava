package tema4.practica41;

public class PruebaTiempo {
	public static void main(String[] args) {
		Tiempo t1 = new Tiempo(1,50, 40);
		Tiempo t2 = new Tiempo(2, 30, 50);
		
		System.out.println("suma entre estos 2 tiempos: ");
		System.out.println("\n   " + t1);
		System.out.println("  +" + t2);
		System.out.println("  -----------");
		sumarTiempos(t1,t2);
		
		System.out.println("   " + t1);
	}
	public static Object sumarTiempos(Tiempo tiempo1,Tiempo tiempo2){
		tiempo1.segundos = tiempo1.segundos + tiempo2.segundos;
		tiempo1.minutos = tiempo1.minutos + tiempo2.minutos;
		tiempo1.horas = tiempo1.horas + tiempo2.horas;
		
		while(tiempo1.segundos >60||tiempo1.minutos >60) {
			if(tiempo1.segundos >60){
				tiempo1.minutos ++;
				tiempo1.segundos = tiempo1.segundos - 60;
			}
			if(tiempo1.minutos > 60){
				tiempo1.horas ++;
				tiempo1.minutos = tiempo1.minutos - 60;

			}
		}
		
		
		return tiempo1;
	}
}
