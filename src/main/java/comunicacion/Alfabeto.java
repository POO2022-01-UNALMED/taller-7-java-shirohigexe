package comunicacion;
//import java.util.*;
public class Alfabeto extends Pictograma{
	
	private String[] letras;
	private String interpretacion;
	
	
	
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	@Override
	public String interpretacion() {
		return this.interpretacion;
	}
	@Override
	public String toString() {
		String alfabeto="";
		for(String i : letras) {
			alfabeto = alfabeto+i+", ";
		}
		return alfabeto.substring(0,alfabeto.length()-2);
		
	}
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
