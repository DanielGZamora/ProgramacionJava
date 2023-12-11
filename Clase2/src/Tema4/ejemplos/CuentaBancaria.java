package Tema4.ejemplos;

public class CuentaBancaria {
	// Propiedades de instancia
	private String numeroCuenta;
	private String titular;
	private double saldo;
	private double interesAnual;
	
	// Constructor
	public CuentaBancaria(String numeroCuenta, String titular,
			double saldo, double interesAnual) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}

	// Getters y setters
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getInteresAnual() {
		return interesAnual;
	}
	
	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	// Otros métodos de instancia
	public void ingresar(double cantidad) {
		if (cantidad > 0)
			saldo += cantidad;
		else
			System.out.println("No se puede ingrensar cantidad negativa");
	}
	
	public void retirar(double cantidad) {
		saldo -= cantidad;
	}
	
	public boolean estaEnNumeroRojos() {
		return saldo < 0;
	}
	
	// toString
	public String toString() {
		return "CuentaBancaria [numeroCuenta = " + numeroCuenta
				+ ", titular = " + titular
				+ ", saldo = " + saldo
				+ ", interesAnual = " + interesAnual + "]";
	}
}
