
package acme.forms;

import acme.client.data.AbstractForm;

public class Client extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	Double						totalNumberOfProgressLogsBelow25;
	Double						totalNumberOfProgressLogsBetween25to50;
	Double						totalNumberOfProgressLogsBetween50to75;
	Double						totalNumberOfProgressLogsAbove75;

	Double						averageContractsBudget;
	Double						deviationProjectsCost;
	Double						minimumContractsBudget;
	Double						maximumContractsBudget;

}
