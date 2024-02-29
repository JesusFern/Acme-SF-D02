package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManagerDashboard  extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfMustUserStories;
	Double						totalNumberOfShouldUserStories;
	Double						totalNumberOfCouldUserStories;
	Double						totalNumberOfWontUserStories;
	
	Double						averageEstimatedCostUserStories;
	Double						deviationEstimatedCostUserStories;
	Double						minimumEstimatedCostUserStories;
	Double						maximumEstimatedCostUserStories;
	
	Double						averageProjectsCost;
	Double						deviationProjectsCost;
	Double						minimumProjectsCost;
	Double						maximumProjectsCost;

}