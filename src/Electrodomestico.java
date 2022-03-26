
public abstract class Electrodomestico {
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = Constantes.precioBase;
		this.color = Constantes.color;
		this.consumoEnergetico = Constantes.consumoEnergetico;
		this.peso = Constantes.peso;
	}
	
	//Precio y peso
	public Electrodomestico(double precioBase,double peso) {
		this.precioBase = precioBase;
		this.color =Constantes.color;
		this.consumoEnergetico = Constantes.consumoEnergetico;
		this.peso = peso;
	}
	
	//Con todos los atributos
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.comprobarColor(color);
		this.comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//Metodos
	private void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A':
			this.consumoEnergetico='A';
			break;
		case 'B':
			this.consumoEnergetico='B';
			break;
		case 'C':
			this.consumoEnergetico='C';
			break;
		case 'D':
			this.consumoEnergetico='D';
			break;
		case 'E':
			this.consumoEnergetico='E';
			break;
		case 'F':
			this.consumoEnergetico='F';
			break;
		default:
			this.consumoEnergetico=Constantes.consumoEnergetico;
			break;
		}
	}
	
	private void comprobarColor(String color) {
		if (color.equals("blanco")) {
			this.color="blanco";
		}else if(color.equals("negro")){
			this.color="negro";
		}else if(color.equals("rojo")) {
			this.color="rojo";
		}else if (color.equals("azul")) {
			this.color="azul";
		}else if(color.equals("gris")) {
			this.color="gris";
		}else {
			this.color=Constantes.color;
		}
	}
	
	//Metodo abstracto
	public abstract void precioFinal();
	
	//Sobrescritura toString()
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
