import java.util.Scanner;
/**
 * Ejemplo de como leer en teclado
 */
public class comentarios {
	/**
	 * Este es el punto de entrada de mi programa
	 */
	public static void main(String[] args) {
		//sc significa escaner, aqui es donde declaramos variables
		Scanner sc = new Scanner(System.in);
		String unNombre;
		
		//Introduccion de datos
		System.out.print("Dime tu nombre: ");
		unNombre = sc.nextLine();
		//Procesamiento de datos
		// (no estamos haciendo ningun calculo en realidad)
		
		//Resultado de datos
		System.out.println("hola, " + unNombre);
		
		sc.close();
		
	}
}
