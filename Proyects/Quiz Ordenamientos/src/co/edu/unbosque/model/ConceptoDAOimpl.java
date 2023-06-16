package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.util.MergeSort;

public class ConceptoDAOimpl implements ConceptoDAO {
	private ArrayList<ConceptoDTO> list;
	
	public ConceptoDAOimpl() {
		list= new ArrayList<ConceptoDTO>();
	}
	public void loadSerializable() {
		list= (ArrayList<ConceptoDTO>) FileHandler.readSerializable("diccionario.EM");
	}

	@Override
	public boolean agregar(String palabra, String definicion, String idioma) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getPalabra().equals(palabra)) {	
				return false;
			}else {
				list.add(new ConceptoDTO(palabra, definicion, idioma));
				FileHandler.writeSerializable(list, "diccionario.EM");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String palabra) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getPalabra().equals(palabra)) {
				list.remove(i);
				FileHandler.writeSerializable(list, "diccionario.EM");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean actualizar(String palabra, String nDefinicion, String nIdioma) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getPalabra().equals(palabra)) {
				list.get(i).setDefinicion(nDefinicion);;
				list.get(i).setIdioma(nIdioma);
				FileHandler.writeSerializable(list, "diccionario.EM");
				return true;
			}
		}
		return false;
		
	}

	@Override
	public String mostrar() {
		String content="";
		list= MergeSort.sort(list, 0, list.size()-1);
		for (ConceptoDTO c : list) {
			content+=c.toString();
		}
		return content;
	}
}
