package co.edu.unbosque.model;

import co.edu.unbosque.util.QueueTAD;

public class RequestDAOImp implements RequestDAO{
	private QueueTAD list;
	
	public RequestDAOImp() {
		list = new QueueTAD();
	}

	@Override
	public boolean create(String nit, String type, String address, String sector) {
		try {			
			list.offer(new RequestDTO(nit, type, address, sector));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String show() {
		if (list.isEmpty()) return " La lista de solicitudes esta vacia!!";
		else return list.showAll();
	}

	public QueueTAD getList() {
		return list;
	}

	public void setList(QueueTAD list) {
		this.list = list;
	}
}
