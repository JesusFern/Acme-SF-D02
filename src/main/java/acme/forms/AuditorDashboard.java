
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	int							totalNumberOfStaticCodeAudit;
	int							totalNumberOfDynamicCodeAudit;

	double						averageNumberOfAuditRecords;
	double						deviationNumberOfAuditRecords;
	double						minimumNumberOfAuditRecords;
	double						maximumNumberOfAuditRecords;

	double						averageNumberOfPeriod;
	double						deviationNumberOfPeriod;
	double						minimumNumberOfPeriod;
	double						maximumNumberOfPeriod;

}
