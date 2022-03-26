import java.util.ArrayList;

public class Vendedor {

	private ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	
	public void venderproducto(Electrodomestico e) {
		electrodomesticos.add(e);
	}
	
	public int totalproductosvendidos()
	{
		int acumularprecio=0;
		for (int i = 0; i < electrodomesticos.size(); i++) {
			//Sacamos el electrodomestico
			Electrodomestico e = electrodomesticos.get(i);
			
			//Calculamos el precio
			e.precioFinal();
			
			//Acumulamos el precio en acumulador
			acumularprecio+=e.getPrecioBase();			
		}
		return acumularprecio;
	}
	
	public void listadoproductosvendidados() {
		int cont_lavadora=0;
		int cont_television=0;
		
		for (int i = 0; i < electrodomesticos.size(); i++) {
			Electrodomestico e = electrodomesticos.get(i);
			if(e instanceof Lavadora)
				cont_lavadora++;
			if(e instanceof Television)
				cont_television++;
			System.out.println(e);
		}
		System.out.println("Numero de lavadoras: " + cont_lavadora);
		System.out.println("Numero de televisiones: " + cont_television);
	}
	
}
