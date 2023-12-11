package practica31;

public class ej1 {

	public static void main(String[] args) {
		int p,s,t;
		
		p=(int)(Math.random()*4);
		s=(int)(Math.random()*3);
		t=(int)(Math.random()*2);
		
		System.out.print("De primero: ");
		
		if(p==0)
			System.out.println("Sopa de verduras");
		else if(p==1)
			System.out.println("Ensalada");
		else if(p==2)
			System.out.println("Jamon");
		else
			System.out.println("Queso");
		
		System.out.println("De segundo: ");
		
		switch(s) {
		case 0:
			System.out.println("Solomillo iberico");
			break;
		case 1:
			System.out.println("San Jacobo");
			break;
		case 2:
			System.out.println("Cordero");
			break;
		}
		switch(t) {
		case 0:
			System.out.println("Arroz con leche");
			break;
		case 1:
			System.out.println("Tortilla de queso");
			break;
		case 2:
			System.out.println("Colacao");
			break;
		}

	}

}
