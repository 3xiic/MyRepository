package co.edu.unbosque.model;

public class CarroDTO  {

	private String placa;
	private String seccion;
	private String estado;
	
	public CarroDTO() {
		// TODO Auto-generated constructor stub
	}

	public CarroDTO(String placa, String seccion, String estado) {
		this.placa = placa;
		this.seccion = seccion;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return " vehiculo registrado por la placa: "+getPlaca()+", ha entrado en la seccion: "+getSeccion()+" y se encuentra:"+getEstado();
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
