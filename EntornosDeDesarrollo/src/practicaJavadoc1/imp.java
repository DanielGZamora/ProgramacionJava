package practicaJavadoc1;

public class imp {
	public static void main(String[] args) {
		//ej1
		GestorDeLibros Libro = new GestorDeLibros("JavaScript: The Good Parts", "Douglas Crockford", 2008);
		impFormato(Libro, 1);
		//ej2
		CalculadoraSimple n1 = new CalculadoraSimple(1, 2, 0);
		n1.potencia(2,34);
		impFormato(n1, 2);
		
		//ej3
		

	}
	public static void impFormato(Object objeto,int numero) {
		System.out.println("------------------------------------------");
		System.out.printf("ej%d:",numero);
		System.out.println(objeto);
		
	}
}
