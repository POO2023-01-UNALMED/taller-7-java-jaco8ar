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
		return "a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z";
	}
	
	public int cantidadLetras(){
		return Alfabeto.letras.length;
	}
	
}
