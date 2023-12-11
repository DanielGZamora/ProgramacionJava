package tema3;

public class ej1 {
/**
 * Simulación del limpiaparabrisas automatico de un coche
 * El limpiaparabrisas solo se activacuando caen mas de 30 gotas/s
 * 
 * extra: haz que el sensor lea cada 5 segundos
 * 0-30 velLenta
 * 31-60 velMedia
 * 61-90 velAlta
 */
	public static void main(String[] args) {
		try{
			while(true) {		//inicia un bucle infinito
				//Declaracion de variales
				int gotasSegundo;
				//Inicialicacion y entrada de datos
				gotasSegundo = (int) (Math.random()*100+1);
				//Procesamiento
				
				//Salida de datos
				System.out.println("gotas: " + gotasSegundo);
				
				 if(gotasSegundo >= 90) {
					 System.out.println("velocidad alta");
				 }
				 else if(gotasSegundo >= 60) {
					 System.out.println("velocidad media");
				 }
				 else if(gotasSegundo >= 30) {
					 System.out.println("velocidad baja");
				 }
				 else if(gotasSegundo < 30) {
					 System.out.println("apagado");
				 }
				 //esperar 5 segundos
				 Thread.sleep(5*1000);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		 
			
	}

}
