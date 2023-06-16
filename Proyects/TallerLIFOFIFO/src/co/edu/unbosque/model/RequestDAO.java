package co.edu.unbosque.model;

public interface RequestDAO {
	public abstract boolean create(String nit, String type, String address, String sector);
	public abstract String show();
}
