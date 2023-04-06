package comunicacion;

public class Alfabeto extends Pictograma{
	String interpretacion;
	static String[] letras;
	
	public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		Alfabeto.letras = letras;
	}
	public String[] getLetras() {
		return letras;
	}
	public String getIntepretacion() {
		return interpretacion;
	}
	public void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		String stringOut = "";
		for (String letra : letras) {
			stringOut = stringOut + letra + ", ";
		}
		return stringOut.substring(0, stringOut.length()-2);
	}
	
	public int cantidadLetras(){
		return Alfabeto.letras.length;
	}
	
}
