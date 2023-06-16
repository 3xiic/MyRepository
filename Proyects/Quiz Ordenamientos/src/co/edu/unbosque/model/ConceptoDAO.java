package co.edu.unbosque.model;

public interface ConceptoDAO {
	public abstract boolean agregar(String palabra, String definicion, String idioma);
	public abstract boolean eliminar(String palabra);
	public abstract boolean actualizar(String palabra, String nDefinicion, String nIdioma);
	public abstract String mostrar();
}
