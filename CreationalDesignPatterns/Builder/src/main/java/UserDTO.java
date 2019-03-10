import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
	private String name;

	//here address is in string
	private String address;

	//here we need to calculate age from birth date
	private String age;

	// Get builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}

	// this is builder class for UserDTO
	public static class UserDTOBuilder {
		private String firstName;

		private String lastName;

		private String age;

		private String address;

		private UserDTO userDTO;

		public UserDTOBuilder withFirstName(String fname) {
			this.firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			this.lastName = lname;
			return this;
		}

		public UserDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + " " + address.getStreet() + "\n" + address.getCity() + ", "
					+ address.getState() + " " + address.getZipcode();
			return this;
		}

		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName + " " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}

	}
}
