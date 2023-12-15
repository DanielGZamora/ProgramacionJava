package Ejercicio2;

import java.util.Date;

/**
 * Clase basada en un videojuego con los métodos básicos para almacenar
 * y gestionar un <strong>videoclub</strong>
 * 
 * @author Dani
 * @version 0.1
 * @see Basedatos
 */

public class Videojuego {
	/**
	 * El título en formato texto del juego(max. 16 letras)
	 */
	private String titulo;
	/**
	 * El genero que pertenece el juego, puede ser de combate, accion, aventura...
	 */
	private String genero;
	/**
	 * Puntuación ponderada sobre paginas de prensa especializada con un peso
	 * del 50/50 entre usuarios y criticos.
	 */
	private float puntuacionMedia;
	/**
	 * Fecha de lanzamiento en nuestra religión.
	 */
	private Date fechaLanzamiento;
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the puntuacionMedia
	 */
	public float getPuntuacionMedia() {
		return puntuacionMedia;
	}
	/**
	 * @param puntuacionMedia the puntuacionMedia to set
	 */
	public void setPuntuacionMedia(float puntuacionMedia) {
		this.puntuacionMedia = puntuacionMedia;
	}
	/**
	 * @return the fechaLanzamiento
	 */
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	/**
	 * @param fechaLanzamiento the fechaLanzamiento to set
	 */
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	
	/**
	 * Incremento la puntuación global en la unidad
	 * @return el alor actualizado de la puntuacion media
	 */
	public float incrPuntuacion() {
		puntuacionMedia++;
		return puntuacionMedia;
		
	}
	/**
	 * Comparamos dos juegos en base a su puntuacion media y se devuelve
	 * el juego con más puntuación
	 * @param juegoAComparar un juego diferente al mio con el juego comparado
	 * @return el juego con mas puntuacion
	 */
	public Videojuego comparar(Videojuego juegoAComparar) {
		if(juegoAComparar.puntuacionMedia>this.puntuacionMedia)
			return juegoAComparar;
		else
			return this;
	}
	/**
	 * Verifica si el videojuego es reciente basándose en la fecha de lanzamiento
	 * un juego reciente es considerado asi si fue lanzado en nuestra región
	 * menos de 6 meses.
	 * @return true si el videojuego es reciente, false si no lo es.
	 */
	public boolean esreciente() {
		Date fechaActual = new Date();
		long fechaActualC = fechaActual.getTime();
		long fechaLanzamientoC = fechaActual.getTime();
		long restoFecha = fechaActualC-fechaLanzamientoC;
		long seisMesesMillis = 6*30*24*60*60*1000;
		if(restoFecha>seisMesesMillis) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	
}
