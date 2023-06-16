package co.edu.unbosque.model;

public interface ClienteDAO {
	public abstract boolean agregarCliente(String nombre, String id, String cel, int valor, String placa, String seccion);
	public abstract String pagar(String id, int valor);
	public abstract String mostrarInfo(String id);
	public abstract String mostrarInfoTodos();
	public abstract String mostrarInfoRetirados();
	public abstract boolean retirarCarro(String placa);
	public abstract boolean actualizarEstado(String placa, String new_estado);
}
