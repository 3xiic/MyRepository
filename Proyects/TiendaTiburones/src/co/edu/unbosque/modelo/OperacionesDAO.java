package co.edu.unbosque.modelo;



public interface OperacionesDAO {
	
	public abstract void crear(Object o);
	public abstract void eliminar(int index);
	public abstract String mostrar();
	public abstract void actualizar(Object o);
	

}
