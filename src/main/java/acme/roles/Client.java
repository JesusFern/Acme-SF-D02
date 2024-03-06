
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Client extends AbstractRole {
	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	@Unique
	@Pattern(regexp = "CLI-[0-9]{4}")
	@NotNull
	private String				identification;

	@NotBlank
	@Size(max = 76)
	@NotNull
	private String				companyName;

	@NotNull
	private Types				type;

	@NotBlank
	@Email
	@NotNull
	private String				email;

	@URL
	private String				optionalLink;

}
