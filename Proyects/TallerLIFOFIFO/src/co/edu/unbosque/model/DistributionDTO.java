package co.edu.unbosque.model;

public class DistributionDTO {
	private String vehicle;
	private String req;
	
	public DistributionDTO() {
		// TODO Auto-generated constructor stub
	}

	public DistributionDTO(String vehicle, String req) {
		this.vehicle = vehicle;
		this.req = req;
	}
	
	public String distribution() {
		return "> " + getVehicle() + " TIENE APILADAS LAS SIGUIENTES SOLICITUDES: \n" + getReq();
	}
	
	public String report() {
		return getVehicle() + " REALIZO LAS SIGUIENTES SOLICITUDES: \n" + getReq();
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}
}
