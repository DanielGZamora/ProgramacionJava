package juegos.habilidad;

public class MarcianitoPrint {

	public static void main(String[] args) {
		Marcianito marcianito1 = new Marcianito(0,0);
		Marcianito marcianito2 = new Marcianito(0,1);
		//antes de batalla
		System.out.println("Info de marcianos");
		impMarciano(marcianito1, marcianito2);
		
		
		System.out.println("En combate: ");
		//transifere vida
		marcianito1.transferir(1, marcianito2);
		
		impMarciano(marcianito1, marcianito2);
		
		//recibe daño
		
		marcianito2.recibirDisparo();
		
		impMarciano(marcianito1, marcianito2);
	
	}
	public static void impMarciano(Marcianito m1,Marcianito m2) {
		System.out.println(m1);
		System.out.println(m2);
	}

}
