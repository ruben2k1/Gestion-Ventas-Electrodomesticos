
public class Lavadora extends Electrodomestico {

	private int carga;
	
	public Lavadora() {
		super();
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, double peso) {
		super(precioBase, color, consumoEnergetico, peso);
	}
	
	public int getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		// TODO Auto-generated method stub
		if(carga>=0&&this.carga<=19)
			this.precioBase=this.precioBase+10;
		else if(carga>=20&&carga<=29)
			this.precioBase+=50;
		else if(carga>=50&&carga<=79)
			this.precioBase+=80;
		else if(carga>=80)
			this.precioBase+=100;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " y de carga: " + this.carga;
	}

}
