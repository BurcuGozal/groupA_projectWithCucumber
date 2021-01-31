package step_definitions;

import java.util.Map;
import io.cucumber.java.DataTableType;
import pojo.User;

public class PojoConverter {
	
	@DataTableType
	public User getUser(Map<String , String>data) {
		
		String address = data.get("address");
		String zip = data.get("zip");
		String state = data.get("state");
		String city = data.get("city");
		String phoneNumber = data.get("phoneNo");
		
		return new User(address,zip,state,city,phoneNumber);
	}

}
