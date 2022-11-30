package in.ashokit.convertors;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Customer;

public class DeSerialization 
{
	public static void main(String[] args) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();
		Customer c1 =mapper.readValue(new File("customer1.json"),Customer.class);
		System.out.println(c1);
		
	}

}
