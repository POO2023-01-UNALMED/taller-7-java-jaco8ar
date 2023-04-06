package comunicacion;

public class Fabula extends Escrito{
	String enseñanza;
	String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas,
			String enseñanza, String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.enseñanza = enseñanza;
		this.interpretacion = interpretacion;	
	}
	
	public void setEnseñanza (String enseñanza) {
		this.enseñanza = enseñanza;}
	public void setInterpretacion (String interpretacion) {
		this.interpretacion = interpretacion;}

	public String getEnseñanza() {
		return enseñanza;}
	public String getInterpretacion() {
		return interpretacion;}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + enseñanza;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina;
	}
	
}
