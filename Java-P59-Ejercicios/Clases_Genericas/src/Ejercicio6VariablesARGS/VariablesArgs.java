package Ejercicio6VariablesARGS;

import Ejer4ClaseGenerica.Generica;

public class VariablesArgs {

	private Generica <Double,Integer,Double> gn ;
	public VariablesArgs() {
		gn=new Generica <Double,Integer,Double>(0.0,0,0);
	} 
	
	public Double sumarValores(double... valores) {
		gn.setAtributo1(0.00);
		for(Double valor:valores) {
			gn.setAtributo1(valor+gn.getAtributo1());
		}
		return gn.getAtributo1();
	}
	
	
	
	
	public void denominaciones(String []denominacion) {
		
		
		
		for (String moneda:denominacion) {
			System.out.println(moneda);
		}
	}
}
