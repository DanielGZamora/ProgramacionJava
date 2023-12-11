import java.util.Scanner;

public class escaner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String unNombre;
		System.out.print("Dime tu nombre: ");
		unNombre = sc.nextLine();
		
		System.out.println("hola, " + unNombre);
		
		sc.close();
		
	}
}
