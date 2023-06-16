package co.edu.unbosque.modelo;

import java.util.ArrayList;

import co.edu.unbosque.persistance.FileController;

public class ProductoDAO implements OperacionesDAO {

	private ArrayList<ProductoDTO> lista;
	private FileController fc;
	
	public ProductoDAO() {
		try {
			fc= new FileController();
			fc.initEntrada("producto");
			lista = (ArrayList<ProductoDTO>) fc.leerSerializado();
			fc.cerrarLector();
		} catch (Exception e) {
			lista=new ArrayList<ProductoDTO>();
		}
		
		
	}

	@Override
	public void crear(Object o) {
		lista.add((ProductoDTO) o);
		fc.initSalida("producto");
		fc.escribirSerializado(lista);
		fc.cerrarSerializado();
		
	}

	@Override
	public void actualizar(Object o) {
		ProductoDTO aux = (ProductoDTO) o;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equals(aux.getNombre())) {
				lista.remove(i);
				lista.add(i, aux);
			}
		}
		fc.initSalida("producto");
		fc.escribirSerializado(lista);
		fc.cerrarSerializado();

	}

	@Override
	public void eliminar(int index) {
		lista.remove(index);
		fc.initSalida("producto");
		fc.escribirSerializado(lista);
		fc.cerrarSerializado();

	}

	@Override
	public String mostrar() {
		StringBuilder salida = new StringBuilder();
		for (ProductoDTO p : lista) {
			salida.append("Nombre: " + p.getNombre()+"\n");
			salida.append("Precio: " + p.getPrecio()+"\n");
			salida.append("-----------------\n");
		}
		return salida.toString();
	}

}
