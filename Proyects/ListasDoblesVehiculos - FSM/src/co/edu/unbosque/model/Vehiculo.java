package co.edu.unbosque.model;

public class Vehiculo {

	private String placa;
	private String modelo;
	private String ciudad_matricula;
	private String propietario;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(String placa, String modelo, String ciudad_matricula, String propietario) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.ciudad_matricula = ciudad_matricula;
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El vehiculo registrado por la placa: "+placa + ", modelo: " +  modelo + ", registrado en la ciudad de: "+ciudad_matricula + ", esta a nombre de: " + propietario;
	}	

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCiudad_matricula() {
		return ciudad_matricula;
	}
	public void setCiudad_matricula(String ciudad_matricula) {
		this.ciudad_matricula = ciudad_matricula;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

}
