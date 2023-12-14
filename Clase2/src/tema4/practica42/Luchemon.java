package tema4.practica42;

public class Luchemon {
	enum Tipo {AGUA, FUEGO, TIERRA, AIRE};
	
	private String nombre;
	private Tipo tipo;
	private int fuerzaAtaque;
	private int precisionAtaque;
	private int energia;
	
	
	public Luchemon(String nombre, Tipo tipo, int fuerzaAtaque, int precisionAtaque) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fuerzaAtaque = fuerzaAtaque;
		this.precisionAtaque = precisionAtaque;
		this.energia = 100;
	}

	public int getNivelAtaque() {
		return (int)(Math.random()*(fuerzaAtaque + 1)) + precisionAtaque;
	}
	
	public int getNivelRefuerzoContra(Tipo tipoAdversario) {
		int refuerzo = 0;
		
		if (this.tipo == Tipo.AGUA && tipoAdversario == Tipo.FUEGO)
			refuerzo = 10;
		else if (this.tipo == Tipo.FUEGO && tipoAdversario == Tipo.TIERRA)
			refuerzo = 10;
		else if (this.tipo == Tipo.TIERRA && tipoAdversario == Tipo.AIRE)
			refuerzo = 10;
		else if (this.tipo == Tipo.AIRE && tipoAdversario == Tipo.AGUA)
			refuerzo = 10;
		
		return refuerzo;
	}
	
	public void disminuirNivelEnergia(int cantidad) {
		energia -= cantidad;
		
		if (energia <= 0) {
			energia = 0;
			System.out.printf("%s ha sido derrotado\n", nombre);
		}
	}
	
	public boolean estaDerrotado() {
		return energia == 0;
	}
	
	public void lucharCon(Luchemon otroLuchemon) {
		int nivelAtaqueEste, nivelAtaqueOtro;
		
		nivelAtaqueEste = this.getNivelAtaque()
				+ this.getNivelRefuerzoContra(otroLuchemon.tipo);

		nivelAtaqueOtro = otroLuchemon.getNivelAtaque()
				+ otroLuchemon.getNivelRefuerzoContra(this.tipo);

		System.out.printf("%s ataca con nivel %d y %s respondo con nivel %d \n",
				this.nombre, nivelAtaqueEste, otroLuchemon.nombre, nivelAtaqueOtro);
		
		if (nivelAtaqueEste > nivelAtaqueOtro) {
			otroLuchemon.disminuirNivelEnergia(nivelAtaqueEste - nivelAtaqueOtro);
		}
		else if (nivelAtaqueEste < nivelAtaqueOtro) {
			this.disminuirNivelEnergia(nivelAtaqueOtro - nivelAtaqueEste);
		}
	}

	@Override
	public String toString() {
		return "Luchemon " + nombre + " tipo " + tipo + " tiene: fuerzaAtaque=" + fuerzaAtaque + ", precisionAtaque="
				+ precisionAtaque + ", energia=" + energia;
	}
	
}
