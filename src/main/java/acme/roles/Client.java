
package acme.roles;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;

public class Client extends AbstractRole {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Unique
	@Pattern(regexp = "CLI-[0-9]{4}")
	private String				identification;

	@NotBlank
	@Size(max = 76)
	private String				companyName;

	@NotBlank
	private Types				type;

	@NotBlank
	@Email
	private String				email;
	
	@URL
	private String optionalLink;

}
