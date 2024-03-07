
package acme.forms;

import acme.client.data.AbstractForm;
import acme.client.data.datatypes.Money;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SponsorDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						totalNumberOfInvoicesWithTaxBelow21;
	Integer						totalNumberOfSponsorshipsLink;

	Double						averageSponsorshipsAmount;
	Double						deviationSponsorshipsAmount;
	Money						minimumSponsorshipsAmount;
	Money						maximumSponsorshipsAmount;

	Double						averageInvoicesQuantity;
	Double						deviationInvoicesQuantity;
	Money						minimumInvoicesQuantity;
	Money						maximumInvoicesQuantity;

}
