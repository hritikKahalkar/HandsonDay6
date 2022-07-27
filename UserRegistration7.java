/*7) A stespective constructors.

Step 3: Create a main class “UserRegistration”, add the following method,

void registerUser(String username,String userCountry) with the below implementation

• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”

• if userCountry isudent portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception. 

Step 1: Create a user defined exception class named “InvalidCountryException”.

Step 2: Overload the r equal to “India”, print the message “User registration done successfully”

Invoke the method registerUser from the main method with the data specified and see how the program behaves.

Example1)

i/p:Mickey,US

o/p:InvalidCountryException should be thrown.

The message should be “User Outside India cannot be registered”

Example2)

i/p:Mini,India

o/p:User registration done successfully
*/

import java.util.*;
class InvalidCountryException extends Exception{
	public InvalidCountryException (String str) {
		super(str);
	}
}
public class UserRegistration7 {
	String username,userCountry;
	void registerUser(String username, String userCountry) {
		this.username = username;
		this.userCountry  =userCountry;
	}
	static void validate(String userCountry)
	throws InvalidCountryException{
		if(userCountry.equalsIgnoreCase("India")) {
			System.out.println("Registration Successful");
		}
		else {
			throw new InvalidCountryException("User outside India");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration7 S1 = new UserRegistration7();
		UserRegistration7 S2 = new UserRegistration7();
		
		try {
			S1.registerUser("Hello","India");
			validate(S1.userCountry);
			S2.registerUser("Hi","America");
			validate(S2.userCountry);
		}
		catch(InvalidCountryException ice){
			System.out.println(ice.toString());
			

		}

	}

}
