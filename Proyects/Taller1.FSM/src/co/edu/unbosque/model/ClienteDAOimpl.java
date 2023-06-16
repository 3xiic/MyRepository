package co.edu.unbosque.model;

public class ClienteDAOimpl implements ClienteDAO{

	private ClienteDTO[] list;
	private ClienteDTO[] listRetirados;

	public ClienteDAOimpl(int n) {
		list = new ClienteDTO[n];
		listRetirados = new ClienteDTO[n];
	}

	@Override
	public boolean agregarCliente(String nombre, String id, String cel, int valor, String placa, String seccion) {
		try {
			for (int i = 0; i < list.length; i++) {
				if (list[i] == null) {					
					list[i] = new ClienteDTO(nombre, id, cel, valor, false, new CarroDTO(placa, seccion, "Iniciando"));
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public String pagar(String id, int valor) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].getId().equals(id)) {
				list[i].setValor(list[i].getValor() - valor);
				if (list[i].getValor() == 0) {					
					list[i].setPagado(true);					
					return "Cancelado con exito!!";
				} else if (list[i].getValor() < 0) {
					list[i].setPagado(true);					
					return "Cancelado con exito!! Se te devuelve $"+Math.abs(list[i].getValor());
				}
				return "Faltan $"+list[i].getValor()+" por pagar!!";
			}
		}
		return "Usuario no encontrado!!";
	}

	@Override
	public String mostrarInfo(String id) {
		try {			
			for (ClienteDTO c : list) {
				if (c.getId().equals(id)) return c.toString();
			}
			for (ClienteDTO c : listRetirados) {
				if (c.getId().equals(id)) return c.toString();
			}
			return "Usuario no encontrado!";
		} catch (Exception e) {
			return "No existe el usuario";
		}
	}

	@Override
	public String mostrarInfoTodos() {
		StringBuilder sb = new StringBuilder();
		for (ClienteDTO c : list) {
			if (c != null) sb.append(" "+c.toString()+"\n"+"_____________________________________________________________________\n");	
		}
		if (sb.toString().equals("")) {
			return "No hay clientes en el taller";
		} else {
			return sb.toString();
		}
	}

	@Override
	public String mostrarInfoRetirados() {
		StringBuilder sb = new StringBuilder();
		for (ClienteDTO c : listRetirados) {
			if (c != null) sb.append(" "+c.toString()+"\n"+"_____________________________________________________________________\n");	
		}
		if (sb.toString().equals("")) {
			return "No hay clientes retirados";
		} else {
			return sb.toString();
		}
	}

	@Override
	public boolean retirarCarro(String placa) {
		try {
			for (int i = 0; i < list.length; i++) {
				if (list[i].getCarro().getPlaca().equals(placa)) {
					if (list[i].isPagado() && list[i].getCarro().getEstado().equals("TERMINADO")) {
						for (int j = 0; j < listRetirados.length; j++) {
							if (listRetirados[j] == null) {								
								listRetirados[j] = list[i];
								break;
							}
						}
						list[i] = null;
						return true;
					}
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public boolean actualizarEstado(String placa, String new_estado) {
		try {			
			for (int i = 0; i < list.length; i++) {
				if (list[i].getCarro().getPlaca().equals(placa)) {
					list[i].getCarro().setEstado(new_estado);
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
