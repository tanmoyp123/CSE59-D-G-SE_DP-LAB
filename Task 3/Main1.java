public class User {
    private String username;
    private String email;
    
public user (String username, String email){
    this.username=username;
    this.email=email;
}
public String getUsername(){
    return username;
}
public String getEmail(){
    return email;
}
}


public class EmailValidator {
public static boolean isValid(User user) {
    if (user.getEmail() != null && user.getEmail().contains("@")){
        return true;
        
    }
    System.out.println("Invalid email format");
    return false;
}
}


public class UserRepository {
    public static void save(User user){
        System.out.println("Connecting to database...");
        System.out.println(
            "Saving user " + user.getUsername() + " to the users table."
        );  
    }
}


public class Main {
    public static void main(String[] args) {

        User user = new User("Itachi Uchiha", "itachi@yahoo.com");

        if (EmailValidator.isValid(user)) {
            UserRepository.save(user);
        }
    }
}
