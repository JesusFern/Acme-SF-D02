
package acme.entities.sponsorships;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.client.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Invoice extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@NotBlank
	@Pattern(regexp = "IN-[0-9]{4}-[0-9]{4}")
	@Column(unique = true)
	private String				code;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	private Date				registrationTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	@NotNull
	private Date				startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	private Date				endDate;

	@NotNull
	@Valid
	@Min(1)
	private Integer				quantity;

	@NotNull
	@Min(0)
	private Double				tax;


	@Transient
	public Double totalAmount() {
		Double result;
		result = this.getQuantity() * this.getTax();
		return result;
	}


	@URL
	private String		link;

	@NotNull
	@Valid
	@ManyToOne
	private Sponsorship	sponsorship;
}
