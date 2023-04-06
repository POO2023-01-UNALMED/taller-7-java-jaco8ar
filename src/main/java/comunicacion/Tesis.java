package comunicacion;

public class Tesis extends Escrito {
	String idea;
	String conclusion;
	String referencias;
	String interpretacion;
	static String[] argumentos;
	
	public Tesis (String origen, String titulo, String autor, int paginas,
			String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo,autor,paginas);
		this.idea = idea;
		
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		Tesis.argumentos = argumentos;
	}
	
	public String getConclusion() {
		return conclusion;}
	public String[] getArgumentos() {
		return argumentos;}
	public String getIdea() {
		return idea;}
	public String getReferencias() {
		return referencias;}
	public String getInterpretacion() {
		return interpretacion;}
	
	public void setConClusion (String conclusion) {
		this.conclusion = conclusion;}
	public void setArgumentos (String[] argumentos) {
		Tesis.argumentos = argumentos;}
	public void setIdea (String idea) {
		this.idea = idea;}
	public void setRefeRencias (String referencias) {
		this.referencias = referencias;}
	public void setInterpretacIon (String interpretacion) {
		this.interpretacion = interpretacion;}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + 
	conclusion + "\n" + referencias;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*5*palabrasPagina;
	}
	
	
	
	
}
