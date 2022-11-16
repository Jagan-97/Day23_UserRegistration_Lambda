import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
    boolean validate(String pattern, String details);
}

public class UserRegistrationLamda {

    public static void main(String[] args) {
        UserRegistrationInterface firstName = (String pattern, String first_name) -> {
            if (Pattern.matches(pattern, first_name)) {
                System.out.println("Entered First Name is Valid");
                return true;

            } else {
                System.out.println("Entered First Name is Invalid");
                return false;
            }
        };
        UserRegistrationInterface lastName = (String pattern, String last_name) -> {
            if (Pattern.matches(pattern, last_name)) {
                System.out.println("Entered Last Name is Valid");
                return true;
            }else {
                System.out.println("Entered Last Name is Invalid");
                return false;
            }
        };

        UserRegistrationInterface emailID = (String pattern, String email) -> {
            if (Pattern.matches(pattern, email)) {
                System.out.println("Entered ID is Valid");
                return true;
            }else {
                System.out.println("Entered ID is Invalid");
                return false;
            }
        };

        firstName.validate("^[A-Z][a-z]{2,}$", "Jagan");
        firstName.validate("^[A-Z][a-z]{2,}$", "jaga");

        lastName.validate("^[A-Z][a-z]{2,}$", "Saran");
        lastName.validate("^[A-Z][a-z]{2,}$", "saran");

        emailID.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$","jagan.psaran38@gmail.com");
        emailID.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$","jagan.com");
    }
}