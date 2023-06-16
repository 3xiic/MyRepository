package co.edu.unbosque.model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import co.edu.unboque.dto.EstudianteDTO;
import co.edu.unbosque.dao.EstudianteDAOimpl;


@ManagedBean
public class EstudianteBean {

	private int cedula;
	private String apellido;
	private String resultado;
	private List <EstudianteDTO> listaEstudiantes;
	
	public String agregar() {
		EstudianteDAOimpl cl = new EstudianteDAOimpl();
		this.resultado = cl.agregar(new EstudianteDTO(this.cedula, this.apellido));
		this.listaEstudiantes = (List<EstudianteDTO>)cl.consultar();
		if(this.resultado.equals("OK") && this.listaEstudiantes!=null) {
			return "tablaestudiantes.xhtml";
		}
		else {
			return "error.xhtml";
		}
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public List<EstudianteDTO> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(List<EstudianteDTO> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	
	
}
