package comunicacion;

public class Libro extends Escrito{
	String co_autor;
	String editorial;
	String edicion;
	String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,
			String co_autor, String editorial,String edicion,String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	public void setEditorial (String editorial) {
		this.editorial = editorial;}
	public void setCo_autor (String co_autor) {
		this.co_autor = co_autor;}
	public void setInterpretacion (String interpretacion) {
		this.interpretacion = interpretacion;}
	public void setEdicion (String edicion) {
		this.edicion = edicion;}

	public String getEditorial() {
		return editorial;}
	public String getCo_autor() {
		return co_autor;}
	public String getInterpretacion() {
		return interpretacion;}
	public String getEdicion() {
		return edicion;}
	
	public String interpretacion() {
		return interpretacion;}
	
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + co_autor + "\n" + editorial + "\n" + 
	edicion ;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*2*palabrasPagina;
	}
	

	

}
