package juegos.habilidad;

public class Marcianito {
	// Propiedades de clase (compartidas por todos los marcianos)
	private static int totalMarcianitosCreados = 0;
	private static int totalMarcianitosVivos = 0;
	
	// Propiedades de instancia (específicas de cada uno de los marcianos)
	private int identificador;
	private int posicionX;
	private int posicionY;
	private int nivelVida;
	/**
	 * Construye un nuevo marciano en la posicion indicada
	 * con nivel de vida = 10 y le asigna un identificador unico
	 * @param posicionX
	 * @param posicionY
	 */
	public Marcianito(int posicionX, int posicionY) {
		totalMarcianitosCreados++;
		totalMarcianitosVivos++;
		identificador = totalMarcianitosCreados;
		
		nivelVida = 10;
		this.posicionX = posicionX; 
		this.posicionY = posicionY; 
	}
	/**
	 * Devuelve el total de marcianos creados hasta el momento
	 * 
	 * @return un número entero
	 */
	public int getTotalMarcianitosCreados() {
		return totalMarcianitosCreados;
	}
	/**
	 * Devuelve el total de marcianos vivos hasta el momento
	 * 
	 * @return un número entero
	 */
	public int getTotalMarcianitosVivos() {
		return totalMarcianitosVivos;
	}
	/**
	 * Devuelve el total de marcianos destruídos hasta el momento
	 * 
	 * @return un número entero
	 */
	public int getTotalMarcianitosDestruidos() {
		return totalMarcianitosCreados - totalMarcianitosVivos;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	@Override
	public String toString() {
		return "Marcianito [identificador=" + identificador + ", posicionX=" + posicionX + ", posicionY=" + posicionY
				+ ", nivelVida=" + nivelVida + "]";
	}
	
	// Otros metodos de instancia
	public void llamar(int cantidad,Marcianito otro) {
		System.out.printf("Marcianito nùmero %d llamado a\n"+ "Marcianito número %d", this.identificador,otro.identificador);
	}
	/**
	 * Transfiere vida hastaq otro marciano.
	 * El marciano actual, nunca se quedará con menos de una unidad de vida
	 * 
	 * @param cantidad
	 * @param otro
	 * @param false si no se puede llevar a cabo la transferencia
	 */
	public boolean transferir(int cantidad,Marcianito otro) {
		int maximoTransf;
		int maxAcept;
		if(this.nivelVida== 1 || otro.nivelVida == 10) {
			System.out.println("Error de transferencia SFX");
			return false;
		}
			
		else {
			if(this.nivelVida > cantidad)
				maximoTransf = cantidad;
			else
				maximoTransf = this.nivelVida -1;
			
		maxAcept = 10 - otro.nivelVida;
		
		if(maxAcept>=maximoTransf)
			this.nivelVida-= maximoTransf;
			otro.nivelVida+= maximoTransf;
			System.out.println("Transferencia SFX");
			return true;
		}
		
	}
	public void recibirDisparo() {
		
		if(nivelVida>0) {
			nivelVida--;
			totalMarcianitosVivos--;
		}
		System.out.println("pow!");
			
	}
	
}
