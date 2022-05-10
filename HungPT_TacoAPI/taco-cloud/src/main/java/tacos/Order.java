package tacos;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Order {
	@NotBlank(message = "Name is required")
	private String name;
	@NotBlank(message = "Street is required")
	private String street;
	@NotBlank(message = "City is required")
	private String city;
	@NotBlank(message = "State is required")
	private String state;
	@NotBlank(message = "Zip code is required")
	private String zip;
	@CreditCardNumber(message = "Not a valid credit card number")		//4539820912435008
//	@NotBlank(message = "Not a valid credit card number. demo: 4539820912435008")		
	private String ccNumber;
	@Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Must be formatted MM/YY")
//	@NotBlank(message = "Not a valid credit card number. demo: 11/19")
	private String ccExpiration;
	@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
//	@NotBlank(message = "Not a valid credit card number. demo: 123")
	private String ccCVV;
	
	private Long id;
	private Date placedAt;
}
