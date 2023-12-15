package practicaJavadoc1;

public class GestorDeLibros {
	public String titulo;
	public String autor;
	public int añoPublicacion;
	public GestorDeLibros(String titulo, String autor, int añoPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
	}
	@Override
	public String toString() {
		return "El libro es " + titulo + "\nEscrito por " + autor + "\nPublicado en " + añoPublicacion;
	}
	
}
