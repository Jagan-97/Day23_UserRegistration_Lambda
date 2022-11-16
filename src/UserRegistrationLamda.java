import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
    boolean validate(String pattern, String details);
}

public class UserRegistrationLamda {

    public static void main(String[] args) {
        UserRegistrationInterface firstName = (String pattern, String first_name) -> {
            if (Pattern.matches(pattern, first_name)) {
                System.out.println("Entered Name is Valid");
                return true;

            } else {
                System.out.println("Entered Name is Invalid");
                return false;
            }
        };
        UserRegistrationInterface lastName = (String pattern, String last_name) -> {
            if (Pattern.matches(pattern, last_name)) {
                System.out.println("Entered Name is Valid");
                return true;
            }else {
                System.out.println("Entered Name is Invalid");
                return false;
            }
        };

        firstName.validate("^[A-Z][a-z]{2,}$", "Jagan");
        firstName.validate("^[A-Z][a-z]{2,}$", "jagan");

        lastName.validate("^[A-Z][a-z]{2,}$", "Saran");
        lastName.validate("^[A-Z][a-z]{2,}$", "sara");

    }
}