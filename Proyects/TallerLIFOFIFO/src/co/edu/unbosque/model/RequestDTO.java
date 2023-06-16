package co.edu.unbosque.model;

public class RequestDTO {
	private String nit;
	private String request_type;
	private String address;
	private String sector;
	
	public RequestDTO() {
		// TODO Auto-generated constructor stub
	}

	public RequestDTO(String nit, String request_type, String address, String sector) {
		this.nit = nit;
		this.request_type = request_type;
		this.address = address;
		this.sector = sector;
	}
	
	@Override
	public String toString() {
		return " El cliente con nit: "+getNit()+" solicito un giro de "+getRequestType()+" dirigido hacia la direccion "+getAddress()+" ubicada en el sector "+getSector();
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRequestType() {
		return request_type;
	}

	public void setRequestType(String request_type) {
		this.request_type = request_type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}
