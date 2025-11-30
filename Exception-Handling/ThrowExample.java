// Example to explain by entering  user data. 
// If the age of an user is less than equal to 0, throw an UserAge Exception.

class UserAgeException extends Exception {
    public UserAgeException(String message) {
        super(message);
    }
}

public class ThrowExample {
    void validateAge(int age) throws UserAgeException {
        if (age <= 0) {
            throw new UserAgeException("Age must be greater than 0.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        ThrowExample example = new ThrowExample();
        try {
            example.validateAge(-5);
        } catch (UserAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
