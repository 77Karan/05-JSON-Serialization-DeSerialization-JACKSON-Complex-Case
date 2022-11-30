package in.ashokit.convertors;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Customer;
import in.ashokit.bindings.InsurancePolicy;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializing 
{
	public static void main(String[] args) throws Exception
	{
		
		InsurancePolicy ipolicy = new InsurancePolicy("TAA","01-01-2020","01-01-2021",5);
		Address addr = new Address("bang",12,"Ind");
		Customer c = new Customer("karan",112,"@gmaial",12,addr,ipolicy);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("Object converted to JSON");
		
		
	}

}
