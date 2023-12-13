package tema4.practica42;

public class Bebida {
	public boolean puestoCafe = false;
	public boolean puestoLeche = false;
	public int cafe;
	public int leche;
	

	public Bebida() {
		super();
	}
	
	@Override
	public String toString() {
		if(puestoCafe==false) {
			return "Leche: no tiene cafe";
		}else if(puestoLeche==false) {
			return "Solo: no tiene leche";
		}else if(leche<=30) {	
			return "Cotrado: menos del 30% es leche";
		}else if(leche>=30 && leche<=80) {
			return "Café con leche: entre 30% y el 80% es leche";
		}else if(leche>=80) {
			return "Manchada: a partir del 80% de leche	";
		}
		return "";
		
	}

	public void ponerCafe(int cantidad){
		if(puestoCafe == false) {
			cafe=cantidad;
			puestoCafe = true;	
		}else {
			System.out.println("ERROR: Ya has puesto cafe");
		}
	}
	public void ponerDescafeinado(int cantidad){
		if(puestoCafe == false) {
			cafe=cantidad;
			puestoCafe = true;
		}else {
			System.out.println("ERROR: Ya has puesto cafe");
		}
	}
	public void ponerLeche(int cantidad){
		if(puestoLeche == false) {
			leche=cantidad;
			puestoLeche = true;
		}else {
			System.out.println("ERROR: Ya has puesto leche");
		}
	}
	public void ponerDesnatada(int cantidad){
		if(puestoLeche == false) {
			leche=cantidad;
			puestoLeche = true;
		}else {
			System.out.println("ERROR: Ya has puesto leche");
		}
	}
	
	
	
}
