package Ejer5Autoboxing;

import Ejer4ClaseGenerica.Generica;

public class CasaCambio {

	// Atributos

	private Generica<Double, Integer, Double> gn;
	private PanelConversor pc;

	// Constructor
	public CasaCambio(PanelConversor pc) {
		gn = new Generica<Double, Integer, Double>(0.0, 0, 0);
		this.pc = pc;
		denominacionesOrigen("USD", "EU", "PESO MX", "PESO CB", "YEN");
	}

	// Metodos
	// cargo en datos con variables args a mi lista despplegable
	public void denominacionesOrigen(String... moneda) {
		for (String m : moneda) {
			pc.cmb_denominacion.addItem(m);
			pc.cmb_cambio.addItem(m);
		}
	}

	// metodo de convertir
	public Double conversorMoneda() {
		gn.setAtributo1(0.00);
		// CONVERTIR DE USD A PESO COLOMBIANO
		if (pc.cmb_denominacion.getSelectedItem().toString().equals("USD")) {
			if (pc.cmb_cambio.getSelectedItem().toString().equals("PESO CB")) 
				gn.setAtributo1(conversorUSD_PC(Double.parseDouble(pc.txt_valor.getText())));
			if (pc.cmb_cambio.getSelectedItem().toString().equals("PESO MX")) 
				gn.setAtributo1(conversorUSD_PMX(Double.parseDouble(pc.txt_total.getText())));
		
			
			
		}
			
		
		return gn.getAtributo1();
	}

	public Double conversorUSD_PC(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * 3879);
	}

	public Double conversorPC_USD(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * (1 / 387));
	}

	public Double conversorUSD_PMX(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * 20.64);
	}

	public Double conversorPMX_USD(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * (1 / 20.64));
	}

	public Double conversorUSD_EU(double valor) {
		gn.setAtributo1(valor);
		return (Double)gn.obtenerValorNumerico((gn.getAtributo1() * 0.87D));
	}

	public Double conversorEU_USD(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * (1 / 0.87));
	}

	public Double conversorUSD_Y(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * 114.27);
	}

	public Double conversorY_USD(double valor) {
		gn.setAtributo1(valor);
		return gn.obtenerValorNumerico(gn.getAtributo1() * (1 / 114.27));
	}

}
