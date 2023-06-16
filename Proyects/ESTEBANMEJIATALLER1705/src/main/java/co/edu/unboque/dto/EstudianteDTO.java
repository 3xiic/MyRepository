package co.edu.unboque.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class EstudianteDTO {

	@Id
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="mejia")
	private String apellido;
	
	public EstudianteDTO() {
		// TODO Auto-generated constructor stub
	}

	public EstudianteDTO(int cedula, String apellido) {
		super();
		this.cedula = cedula;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Cedula "+cedula+" Apellido: "+apellido;
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
	
	
	

}
