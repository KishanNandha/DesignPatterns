import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

//this class might be entity class from db
@Getter
@Setter
public class User {
	
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private Address address;

}
