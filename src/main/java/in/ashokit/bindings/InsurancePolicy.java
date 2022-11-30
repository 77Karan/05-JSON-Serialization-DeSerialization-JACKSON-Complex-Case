package in.ashokit.bindings;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePolicy 
{
	private String policyName;
	private String policyStartDate;
	private String ploicyEndDate;
	private int policyAmount;

}
