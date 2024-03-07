
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManagerDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	int							totalNumberOfMustUserStories;
	int							totalNumberOfShouldUserStories;
	int							totalNumberOfCouldUserStories;
	int							totalNumberOfWontUserStories;

	double						averageEstimatedCostUserStories;
	double						deviationEstimatedCostUserStories;
	int							minimumEstimatedCostUserStories;
	int							maximumEstimatedCostUserStories;

	double						averageProjectsCost;
	double						deviationProjectsCost;
	int							minimumProjectsCost;
	int							maximumProjectsCost;

}
