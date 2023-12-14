package Tema4.ejemplos;

public class Libro {
	enum Genero {MISTERIO, TERROR, DRAMA, HUMOR};
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String isbn;
	private int ejemplaresExistentes;
	private int numeroEjemplares;

	public Libro(String titulo, String autor, int numeroPaginas, String isbn, int ejemplaresExistentes,
			int numeroEjemplares) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.isbn = isbn;
		this.ejemplaresExistentes = ejemplaresExistentes;
		this.numeroEjemplares = numeroEjemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEjemplaresExistentes() {
		return ejemplaresExistentes;
	}

	public void setEjemplaresExistentes(int ejemplaresExistentes) {
		this.ejemplaresExistentes = ejemplaresExistentes;
	}

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + ", isbn=" + isbn
				+ ", ejemplaresExistentes=" + ejemplaresExistentes + ", numeroEjemplares=" + numeroEjemplares + "]";
	}
	public void prestar() {
		
	}
	public void devolver() {
		
	}
	
	
	
	

}
