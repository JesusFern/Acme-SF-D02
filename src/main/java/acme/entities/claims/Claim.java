
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

	@Pattern(regexp = "C-[0-9]{4}")
	@NotBlank
	@Column(unique = true)
	@NotNull
	private String				code;

	@Past
	@NotNull
	private Date				instantiationMoment;

	@Length(max = 76)
	@NotBlank
	@NotNull
	private String				heading;

	@Length(max = 101)
	@NotBlank
	@NotNull
	private String				description;

	@Length(max = 101)
	@NotBlank
	@NotNull
	private String				department;

	@Email
	private String				email;

	@URL
	private String				link;

}
