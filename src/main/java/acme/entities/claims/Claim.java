
package acme.entities.claims;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Claim extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Pattern(regexp = "^C-[0-9]{4}$", message = "{validation.pattern} + C-0000")
	@Column(unique = true)
	@NotBlank
	private String				code;

	@Past
	@NotNull
	private Date				instantiationMoment;

	@Length(max = 75)
	@NotBlank
	private String				heading;

	@Length(max = 100)
	@NotBlank
	private String				description;

	@Length(max = 100)
	@NotBlank
	private String				department;

	@Email
	private String				email;

	@URL
	private String				link;

}
