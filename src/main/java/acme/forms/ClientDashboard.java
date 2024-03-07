
package acme.forms;

import acme.client.data.AbstractForm;

public class ClientDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	int							totalNumberOfProgressLogsBelow25;
	int							totalNumberOfProgressLogsBetween25to50;
	int							totalNumberOfProgressLogsBetween50to75;
	int							totalNumberOfProgressLogsAbove75;

	double						averageContractsBudget;
	double						deviationProjectsCost;
	double						minimumContractsBudget;
	double						maximumContractsBudget;

}
