import lombok.Getter;
import lombok.Setter;

//this class might be entity class from db
@Getter
@Setter
public class Address {

	private String houseNumber;

	private String street;

	private String city;

	private String zipcode;

	private String state;

}
