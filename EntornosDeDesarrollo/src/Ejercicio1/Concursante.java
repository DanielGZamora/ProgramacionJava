package Ejercicio1;

/**
 * @author Dani
 * @param Nombre
 * @param Numero favorito
 * @param Signo del zodiaco
 * @param Color favorito
 * 
 */
public class Concursante {
	private String nombre;
	private int nFavorito;
	private String signoZodiaco;
	private String cFavorito;
	public Concursante(String nombre, int nFavorito, String signoZodiaco, String cFavorito) {
		super();
		this.nombre = nombre;
		this.nFavorito = nFavorito;
		this.signoZodiaco = signoZodiaco;
		this.cFavorito = cFavorito;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the nFavorito
	 */
	public int getnFavorito() {
		return nFavorito;
	}
	/**
	 * @param nFavorito the nFavorito to set
	 */
	public void setnFavorito(int nFavorito) {
		this.nFavorito = nFavorito;
	}
	/**
	 * @return the signoZodiaco
	 */
	public String getSignoZodiaco() {
		return signoZodiaco;
	}
	/**
	 * @param signoZodiaco the signoZodiaco to set
	 */
	public void setSignoZodiaco(String signoZodiaco) {
		this.signoZodiaco = signoZodiaco;
	}
	/**
	 * @return the cFavorito
	 */
	public String getcFavorito() {
		return cFavorito;
	}
	/**
	 * @param cFavorito the cFavorito to set
	 */
	public void setcFavorito(String cFavorito) {
		this.cFavorito = cFavorito;
	}
	
	
	
}
