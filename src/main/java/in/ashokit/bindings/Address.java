package in.ashokit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address 
{
	private String city;
	private Integer pinCode;
	private String country;

}
