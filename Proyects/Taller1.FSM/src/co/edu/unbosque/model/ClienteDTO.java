package co.edu.unbosque.model;

public class ClienteDTO {

	private String nombre;
	private String id;
	private String cel;
	private int valor;
	private boolean pagado;
	private CarroDTO carro;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(String nombre, String id, String cel, int valor, boolean pagado, CarroDTO carro) {
		this.nombre = nombre;
		this.id = id;
		this.cel = cel;
		this.valor = valor;
		this.pagado = pagado;
		this.carro = carro;
	}
	
	@Override
	public String toString() {
		String res="";
		if(pagado){
			res= "Ya pagado";
		}else {
			res= "No ha pagado";
		}
		return "El cliente con el nombre:"+getNombre()+", identificado con id: "+getId()+", Numero telefonico: "+getCel()+" "+res+"\n tiene un"+carro.toString();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public CarroDTO getCarro() {
		return carro;
	}

	public void setCarro(CarroDTO carro) {
		this.carro = carro;
	}
	
}
