
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sponsor extends AbstractRole {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Size(max = 75)
	private String				name;

	@NotBlank
	@Size(max = 100)
	private String				benefits;

	@URL
	private String				webPage;

	@Email
	private String				email;

}
