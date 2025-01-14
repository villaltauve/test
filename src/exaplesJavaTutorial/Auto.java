package exaplesJavaTutorial;

public class Auto {
	
	public Auto() {
		puertas = 4;
		asientos = 5;
		ruedas = 4;
		color = "Blanco";
		ac = false;
		peso = 2000;
		tamano = 200;
		precio = 8000;
		asientos_cuero = false;
		
	}
	
	public void setAc(String tieneAc) {
		if (tieneAc.equalsIgnoreCase("si")) {
			ac = true;
		} else {
			ac = false;
		}
	}
	
	public void setAsientosCuero(String tieneAsientosCuero) {
		if (tieneAsientosCuero.equalsIgnoreCase("si")) {
			asientos_cuero = true;
		} else {
			asientos_cuero = false;
		}
	}
	
	public String tieneAc() {
		if (ac) {
			return "El auto tiene Aire Acondicionado";
		} else {
			return "El auto NO tiene Aire Acondicionado";
		}
	}
	
	public String tieneAsientosCuero() {
		if (asientos_cuero) {
			return "El auto tiene Asientos de Cuero";
		} else {
			return "El auto NO tiene Asientos de Cuero";
		}
	}
	
	public String dimePrecio() {
		int precioBase = precio;
		if (ac == true) {
			precioBase+=200;
		}
		if (asientos_cuero == true) {
			precioBase+=400;
		}
		return "El auto tiene un precio de: " + precioBase;
	}
	
	public String dimeDatosGenerales() {
		return "El auto tiene un precio de: " + dimePrecio()
				+ "\nEl auto tiene: " + puertas + " puertas"
				+ "\nEl auto tiene un color: " + color
				+ "\nEl auto tiene un peso de: " + peso + " kilos"
				+ "\nEl auto tiene: " + ruedas + " ruedas"
				+ "\nEl auto tiene: " + asientos + " asientos"
				+ "\n¿El auto tiene aire acondicionado?: " + ac
				+ "\n¿El auto tiene asientos de cuero?: " + asientos_cuero
				+ "\nEl auto tiene un tamano de: " + tamano;
				
	}
	
	private boolean asientos_cuero;
	private boolean ac;
	private int puertas;
	private String color;
	private int peso;
	private int ruedas;
	private int asientos;
	private int tamano;
	private int precio;
	
	
}
