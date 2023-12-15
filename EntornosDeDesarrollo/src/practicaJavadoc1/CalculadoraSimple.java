package practicaJavadoc1;

public class CalculadoraSimple {
	//OOP para una calculadora simple?
	public long numero1;
	public long numero2;
	public long resultado;
	
	
	
	public CalculadoraSimple(long numero1, long numero2, long resultado) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return "El resultado es: " + resultado;
	}

	/**
	 * Sirve para multiplicar dos numeros
	 * @param n1 el primer numero
	 * @param n2 el segundo numero
	 * @return el resultado
	 */
	public long multiplicar(long n1,long n2) {
		resultado = n1*n2;
		return resultado;
	}
	/**
	 * Sirve para dividir dos numeros
	 * @param n1
	 * @param n2
	 * @return
	 */
	public long division(long n1, long n2) {
		if(n1>0 && n2>0) {
			resultado = n1/n2;
			return resultado;
		} else {
			System.out.println("no se puede dividir entre 0");
			return resultado;
		}
		
	}
	/**
	 * Da la potencia de un numero
	 * @param n1 La base de la potencia
	 * @param n2 el exponente al que lo multiplicamos
	 * @return
	 */
	public long potencia(long n1,long n2) {
		resultado = n1;
		for (int i = 1; i < n2; i++) {
			resultado *= n1;
		}
		return resultado;
		
	}
	/**
	 * Devuelve la raiz cuadrada de un numero
	 * @param n1 el numero que vamos a utilizar
	 * @return la raiz cuadrada del numero
	 */
	public long raizCuadrada(long n1) {
		Math.sqrt(n1);
		resultado = n1;
		
		return resultado;
		
	}
	
	
	
	
}
