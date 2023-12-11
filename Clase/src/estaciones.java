
public class estaciones {

	public static void main(String[] args) {
		enum Estacion {PRIMAVERA, VERANO, OTOÑO, INVIERNO};
		enum Continente {AFRICA, AMERICA, ASIA, EUROPA, OCEANIA};
		
		Estacion unaEstacion;
		Continente unContinente;
		
		unaEstacion = Estacion.INVIERNO;
		unContinente = Continente.AFRICA;
		
		System.out.println(unaEstacion);
		System.out.println(unContinente);
		
		
		unaEstacion = Estacion.VERANO;
		unContinente = Continente.EUROPA;
		
		System.out.println(unaEstacion);
		System.out.println(unContinente);
		
		unaEstacion = Estacion.OTOÑO;
		unContinente = Continente.OCEANIA;
		
		System.out.println(unaEstacion);
		System.out.println(unContinente);
		

	}

}
