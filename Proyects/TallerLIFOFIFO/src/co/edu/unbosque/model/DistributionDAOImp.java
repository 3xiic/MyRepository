package co.edu.unbosque.model;

import co.edu.unbosque.util.QueueTAD;
import co.edu.unbosque.util.StackTAD;

public class DistributionDAOImp implements DistributionDAO{
	private DistributionDTO[] initialDistribution;
	private DistributionDTO[] reports;
	private StackTAD[] trucks;
	private StackTAD[] vans;
	
	public DistributionDAOImp() {
		trucks = new StackTAD[4];
		vans = new StackTAD[4];
		for (int i = 0; i < 4; i++) {
			trucks[i] = new StackTAD();
			vans[i] = new StackTAD();
		}
		initialDistribution = new DistributionDTO[8];
		reports = new DistributionDTO[8];
	}
	
	@Override
	public boolean generateDistribution(QueueTAD q) {
		if (q.isEmpty()) return false;
		int tam = q.size();
		for (int i = 0; i < tam; i++) {
			RequestDTO auxreq = (RequestDTO) q.poll();
			if (auxreq.getRequestType().equalsIgnoreCase("MERCANCIA")) {
				switch (auxreq.getSector()) {
				case "SUR":
					trucks[0].push(auxreq.toString());
					break;
				case "NORTE":
					trucks[1].push(auxreq.toString());
					break;
				case "ORIENTE":
					trucks[2].push(auxreq.toString());
					break;
				case "OCCIDENTE":
					trucks[3].push(auxreq.toString());
					break;
				}
			} else if (auxreq.getRequestType().equalsIgnoreCase("DINERO")) {
				switch (auxreq.getSector()) {
				case "SUR":
					vans[0].push(auxreq.toString());
					break;
				case "NORTE":
					vans[1].push(auxreq.toString());
					break;
				case "ORIENTE":
					vans[2].push(auxreq.toString());
					break;
				case "OCCIDENTE":
					vans[3].push(auxreq.toString());
					break;
				}
			}
		}
		return true;
	}

	@Override
	public String showInitialDistribution() {
		boolean allEmpty = true;
		for (int i = 1; i <= 8; i++) {
			if (i <= 4) {
				initialDistribution[i-1] = new DistributionDTO("CAMION "+i, trucks[i-1].showAll());
				if (!trucks[i-1].isEmpty()) {
					allEmpty = false;
				}
			} else {
				initialDistribution[i-1] = new DistributionDTO("VAN "+(i-4), vans[i-5].showAll());
				if (!vans[i-5].isEmpty()) {
					allEmpty = false;
				}
			}
		}
		String imp = "";
		for (int i = 0; i < initialDistribution.length; i++) {
			imp += initialDistribution[i].distribution() + "\n";
		}
		if (allEmpty) return "No se ha generado la distribucion de pedidos!!";
		else return imp;
	}

	@Override
	public String showReports() {
		boolean allEmpty = true;
		for (int i = 1; i <= 8; i++) {
			if (i <= 4) {
				if (!trucks[i-1].isEmpty()) {
					allEmpty = false;
				}
				reports[i-1] = new DistributionDTO("CAMION "+i, trucks[i-1].showAllAndPop());
			} else {
				if (!vans[i-5].isEmpty()) {
					allEmpty = false;
				}
				reports[i-1] = new DistributionDTO("VAN "+(i-4), vans[i-5].showAllAndPop());
			}
		}
		String imp = "";
		for (int i = 0; i < reports.length; i++) {
			imp += reports[i].report() + "\n";
		}
		if (allEmpty) return "No se ha generado la distribucion de pedidos!!";
		else return imp;
	}

}
