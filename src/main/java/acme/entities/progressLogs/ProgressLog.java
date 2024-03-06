
package acme.entities.progressLogs;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.checkerframework.common.aliasing.qual.Unique;

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
	@Unique
	@Pattern(regexp = "PG-[A-Z]{1,2}-[0-9]{4}")
	private String				recordId;

	@Positive
	private double				percentageCompleteness;

	@NotBlank
	@Size(max = 100)
	private String				comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
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
