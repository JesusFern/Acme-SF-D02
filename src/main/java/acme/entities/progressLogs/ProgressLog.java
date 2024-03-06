
package acme.entities.progressLogs;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import acme.client.data.AbstractEntity;
import acme.entities.contracts.Contract;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProgressLog extends AbstractEntity {

	private static final long	serialVersionUID	= 1L;

	// Attributes
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^PG-[A-Z]{1,2}-[0-9]{4}$", message = "{validation.pattern} + PG-A-1111")
	private String				recordId;

	@Positive
	private double				percentageCompleteness;

	@NotBlank
	@Size(max = 100)
	private String				comment;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	@NotNull
	private Date				registrationMoment;

	@NotBlank
	@Size(max = 75)
	private String				responsiblePerson;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	private Contract			contract;

}
