package comunicacion;

public class Periodico extends Escrito{
	String fecha;
	String primicia;
	String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas,
			String fecha, String primicia, String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	public void setPrimicia (String primicia) {
		this.primicia = primicia;}
	public void setFecha (String fecha) {
		this.fecha = fecha;}
	public void setInterpretacion (String interpretacion) {
		this.interpretacion = interpretacion;}

	public String getPrimicia() {
		return primicia;}
	public String getFecha() {
		return fecha;}
	public String getInterpretacion() {
		return interpretacion;}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha + "\n" + primicia;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*10*palabrasPagina;
	}
	


	
}
