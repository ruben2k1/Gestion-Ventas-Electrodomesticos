
public class Television extends Electrodomestico {

	private int pulgadas;
	private boolean TDT;
	
	public Television() {
		super();
		this.pulgadas = Constantes.pulgadas;
		this.TDT = Constantes.TDT;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.pulgadas = Constantes.pulgadas;
		this.TDT = Constantes.TDT;
	}

	public Television(int precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.pulgadas = pulgadas;
		this.TDT = tdt;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public boolean isTDT() {
		return TDT;
	}

	@Override
	public String toString() {
		return  super.toString()+ "\nTelevision1 [pulgadas=" + pulgadas + ", TDT=" + TDT + "]";
	}

	@Override
	public void precioFinal() {
		// TODO Auto-generated method stub
		if(pulgadas>40) {
			
		switch (this.consumoEnergetico) {
		case 'A':
			precioBase = precioBase*1.3+100;
			break;
			
		case 'B':
			precioBase = precioBase*1.3+80;
			break;
			
		case 'C':
			precioBase = precioBase*1.3+60;
			break;
			
		case 'D':
			precioBase = precioBase*1.3+50;
			break;
			
		case 'E':
			precioBase = precioBase*1.3+30;
			break;
			
		case 'F':
			precioBase = precioBase*1.3+10;
			break;
			
		default:
			this.precioBase=Constantes.precioBase;
			break;}
		}else if(this.TDT) {
			
			switch (this.consumoEnergetico) {
			case 'A':
				precioBase = 50+100;
				break;
				
			case 'B':
				precioBase = 50+80;
				break;
				
			case 'C':
				precioBase = 50+60;
				break;
				
			case 'D':
				precioBase = 50+50;
				break;
				
			case 'E':
				precioBase = 50+30;
				break;
				
			case 'F':
				precioBase = 50+10;
				break;
				
			default:
				this.precioBase = Constantes.precioBase;
				break;
			}
		}
	}
}
