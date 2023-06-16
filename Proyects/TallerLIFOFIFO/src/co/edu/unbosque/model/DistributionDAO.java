package co.edu.unbosque.model;

import co.edu.unbosque.util.QueueTAD;

public interface DistributionDAO {
	public abstract boolean generateDistribution(QueueTAD q);
	public abstract String showInitialDistribution();
	public abstract String showReports();
}
