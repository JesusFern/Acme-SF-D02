
package acme.forms;

import acme.client.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Auditor extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfStaticCodeAudit;
	Double						totalNumberOfDynamicCodeAudit;

	Double						averageNumberOfAuditRecords;
	Double						deviationNumberOfAuditRecords;
	Double						minimumNumberOfAuditRecords;
	Double						maximumNumberOfAuditRecords;

	Double						averageNumberOfPeriod;
	Double						deviationNumberOfPeriod;
	Double						minimumNumberOfPeriod;
	Double						maximumNumberOfPeriod;

}
