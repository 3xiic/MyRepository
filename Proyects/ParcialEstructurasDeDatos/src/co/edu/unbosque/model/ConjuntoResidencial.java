package co.edu.unbosque.model;

public class ConjuntoResidencial {
	protected String nombre;
	protected String direccion;
	protected String administrador;
	protected int torres=3;
	protected int cantAptos=12;
	protected long[][] cuotas = new long [torres][cantAptos];

	public void asignarValor(int t, int valor) {
		if(t==1) {
			for (int i = 0; i < 12; i++) {
				cuotas[0][i] = valor;
			}
		}else if(t==2) {
			for (int i = 0; i < 12; i++) {
				cuotas[1][i] = valor;
			}
		}else {
			for (int i = 0; i < 12; i++) {
				cuotas[2][i] = valor;
			}
		}
	}
	public String leerCuotas() {
		String res="";
		for (int x=0; x < cuotas.length; x++) {
			  res+=("Torre: "+(x+1)+"|");
			  for (int y=0; y < cuotas[x].length; y++) {
			    res+=("Ap: "+(y+1)+" Cuota:"+cuotas[x][y]+"");
			    if (y!=cuotas[x].length-1) res+=("\t");
			  }
			  res+=("|"+"\n");
			}
		return res;

	}
	public String mostrarCuotas(int t) {
		String res="";
		if(t==1) {
			for (int i = 0; i < cuotas.length; i++) {
				res= "El valor para la torre: "+t+" es: "+cuotas[0][i]+"$"+"\n";
			}
		}else if(t==2) {
			for (int i = 0; i < cuotas.length; i++) {
				res= "El valor para la torre: "+t+" es: "+cuotas[1][i]+"$"+"\n";
			}
		}else if(t==3){
			for (int i = 0; i < cuotas.length; i++) {
				res= "El valor para la torre: "+t+" es: "+cuotas[2][i]+"$"+"\n";
			}
		}else {
			res= "No existe esa torre";
		}
		return res;
	}
	
	public String aumentarMes(int valorAdd) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 12; j++) {
				cuotas[i][j]+=valorAdd;
			}
		}
		return "El valor que asciende cada mes es: "+valorAdd+"$";
	}
	public void aumentarAnual(int valorAdd) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 12; j++) {
				cuotas[i][j]+=valorAdd;
			}
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getAdministrador() {
		return administrador;
	}
	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}
	public int getTorres() {
		return torres;
	}
	public void setTorres(int torres) {
		this.torres = torres;
	}
	public int getCantAptos() {
		return cantAptos;
	}
	public void setCantAptos(int cantAptos) {
		this.cantAptos = cantAptos;
	}
	public long[][] getCuotas() {
		return cuotas;
	}
	public void setCuotas(long[][] cuotas) {
		this.cuotas = cuotas;
	}


}
