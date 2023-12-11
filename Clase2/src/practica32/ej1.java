package practica32;

/*
 * Escribe un programa que genere fechas al azar con el formato 25 de enero de 2013 . Se
 * tendrán en cuenta las siguientes restricciones:
	-El día será un número del 1 al 28, 29, 30 o 31 (según el mes).
	-El mes aparecerá en formato escrito: enero, febrero, marzo...
	-El año debe variar entre 1960 y 2060.
 */
public class ej1 {

	public static void main(String[] args) {
		int d = 0, m, y;
		d = (int) (Math.random() * 31 + 1);
		m = (int) (Math.random() * 12 + 1);
		y = (int) (Math.random() * 100 + 1960);

		switch (m) {
		case 1:
			System.out.printf("%d de enero del %d \n",d,y );
			break;
		case 2:
			System.out.printf("%d de febrero del %d \n",d-3,y );
			break;
		case 3:
			System.out.printf("%d de marzo del %d \n",d,y );
			break;
		case 4:
			System.out.printf("%d de abril del %d \n",d-1,y );
			break;
		case 5:
			System.out.printf("%d de mayo del %d \n",d,y );
			break;
		case 6:
			System.out.printf("%d de junio del %d \n",d-1,y );
			break;
		case 7:
			System.out.printf("%d de julio del %d \n",d,y );
			break;
		case 8:
			System.out.printf("%d de agosto del %d \n",d,y );
			break;
		case 9:
			System.out.printf("%d de septiembre del %d \n",d-1,y );
			break;
		case 10:
			System.out.printf("%d de octubre del %d \n",d,y );
			break;
		case 11:
			System.out.printf("%d de noviembre del %d \n",d-1,y );
			break;
		case 12:
			System.out.printf("%d de diciembre del %d \n",d,y );
			break;
		}
	}

}
