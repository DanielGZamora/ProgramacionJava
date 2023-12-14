package tema4.practica41;

public class Libro {
	enum Genero {
		MISTERIO, TERROR, DRAMA, HUMOR
	};

	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String isbn;
	private int ejemplaresDisponibles;
	private int ejemplaresPrestados;

	public Libro(String titulo, String autor, int numeroPaginas, String isbn, int ejemplaresExistentes) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.isbn = isbn;
		this.ejemplaresDisponibles = ejemplaresExistentes;
	}
	//getters/setters
	public int getEjemplaresExistentes() {
		return ejemplaresDisponibles;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + ", isbn=" + isbn
				+ ", ejemplaresExistentes=" + ejemplaresDisponibles + ", numeroEjemplares=" + ejemplaresPrestados + "]";
	}

	public void prestar() {
		if (getEjemplaresExistentes() > 0) {
			ejemplaresPrestados++;
			System.out.printf("Se ha prestado un ejemplar de %s. Quedan %d ejemplares.\n",
					titulo, getEjemplaresExistentes());
		}
		else {
			System.out.println("ERROR: No quedan ejemplares de: " + titulo);
		}
	}
	
	public void devolver() {
		if (ejemplaresPrestados > 0) {
			ejemplaresPrestados--;
			System.out.printf("Se ha devuelto un ejemplar de %s. Quedan %d ejemplares.\n",
					titulo, getEjemplaresExistentes());
		}
		else {
			System.out.println("ERROR: No quedan ejemplares por devolver de: " + titulo);
		}
	}

}
