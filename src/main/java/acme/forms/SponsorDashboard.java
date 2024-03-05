
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SponsorDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfInvoicesWithTaxBelow21;
	Double						totalNumberOfInvoicesWithTaxEqual21;
	Double						totalNumberOfSponsorshipsLink;

	Double						averageSponsorshipsAmount;
	Double						deviationSponsorshipsAmount;
	Double						minimumSponsorshipsAmount;
	Double						maximumSponsorshipsAmount;

	Double						averageInvoicesQuantity;
	Double						deviationInvoicesQuantity;
	Double						minimumInvoicesQuantity;
	Double						maximumInvoicesQuantity;

}
