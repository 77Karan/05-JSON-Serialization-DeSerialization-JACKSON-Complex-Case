package in.ashokit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
	private String custName;
	private Integer custId;
	private String custEmail;
	private Integer custAge;
	private Address addr;
	private InsurancePolicy ipolicy;

}
