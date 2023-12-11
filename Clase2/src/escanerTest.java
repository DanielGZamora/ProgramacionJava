import java.util.Scanner;
public class escanerTest {
	public static void main(String[] args) {
		/** p.d: no te esperes que vaya a hacer este tipo de cosas cuando empecemos con OOP, todo esto lo ago por si
		en algun momento hay otro ejercicio asi o simplemente por aburrimiento, programar es divertido cuando no tienes
		que comerte demasiado la cabeza
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int n1 = Integer.parseInt(sc.nextLine()); //¿Cual es la diferencia entre usar eso y usar "sc.nextInt();"?
		System.out.print("Introduce el segundo numero: ");
		int n2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("selecciona un modo: ");
		String selector = sc.nextLine();
		  
		switch(selector){
				default:
				System.out.println("error");
				break;
		  		case "suma":
		  			System.out.println("La suma es: " + n1 + " + "  + n2 +" = " +(n1+n2));
		  			break;
		  		case "resta":
		  			System.out.println("La resta es: " + n1 + " + "  + n2 +" = " +(n1-n2));
		  			break;
		  		case "multiplicacion":
		  			System.out.println("La multiplicacion es: " + n1 + " + "  + n2 +" = " +(n1*n2));
		  			break;
		  		case "division":
		  			System.out.println("La division es: " + n1 + " + "  + n2 +" = " +(n1/n2));
		  			break;
		  }
		 */		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int n1 = Integer.parseInt(sc.nextLine()); //¿Cual es la diferencia entre usar eso y usar "sc.nextInt();"?
		System.out.print("Introduce el segundo numero: ");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.println("La suma es: " + n1 + " + "  + n2 +" = " +(n1+n2));
		System.out.println("La resta es: " + n1 + " + "  + n2 +" = " +(n1-n2));
		System.out.println("La multiplicacion es: " + n1 + " + "  + n2 +" = " +(n1*n2));
		System.out.println("La division es: " + n1 + " + "  + n2 +" = " +(n1/n2));
		sc.close();
	}
}