
package acme.entities.trainingModule;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TrainingModule extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Pattern(regexp = "[A-Z]{1,3}-[0-9]{3}", message = "{validation.pattern} + ABC-000")
	@Column(unique = true)
	@NotBlank
	private String				code;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	@NotNull
	private Date				creationMoment;

	@Length(max = 100)
	@NotBlank
	private String				details;

	@NotNull
	private Level				difficulty;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date				startUpdateMoment;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date				endUpdateMoment;

	@URL
	private String				link;

	private int					time;
}
