package Ejer7Comodines;
import java.util.*;
import Ejer4ClaseGenerica.Generica;
public class Automovil {

	private Generica <?,?,?>gn;
	public String setPropietario(String name) {
		Date fecha=new Date();
		gn=new Generica<String,Date,Double>(name,fecha, fecha);
		return "Propietario: "+gn.getAtributo1().toString()+"\nFecha registro: "+gn.getAtributo3().toString();
		
		
		
		
		
		
	}
	
	
	
	
}
