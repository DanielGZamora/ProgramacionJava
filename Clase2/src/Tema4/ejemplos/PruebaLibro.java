package Tema4.ejemplos;

public class PruebaLibro {
	public static void main(String[] args) {
		Libro l1,l2,l3;
		l1= new Libro("El lazarillo de Tormes", "Anonimo", 100, "0", 2);		
		l2= new Libro("El Quijote", "Cervantes", 820, "1", 5);
		l3= new Libro("La celestina", "Fernando de Roja", 420, "2", 1);
		
		l1.prestar();
		l1.prestar();
		l2.prestar();
		l3.prestar();
		l1.prestar();
		
	}
}
