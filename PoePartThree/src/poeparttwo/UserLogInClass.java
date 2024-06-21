/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poeparttwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Branden
 */
public class UserLogInClass {
    //Declaration of Variables
    private String userName;
    private String Password;
    private String firstName;
    private String Surname;
    //Initializing the methods and objects thst will be used in this class
    public UserLogInClass(String userName, String Password, String firstName, String Surname) {
        this.userName = userName;
        this.Password = Password;
        this.firstName = firstName;
        this.Surname = Surname;
    }
    //Setting the getters and setters
    public String getUsername() {
        return userName;
    }  public String getPassword() {
        return Password;
    }  public String getFirstName() {
        return firstName;
    } public String Surname() {
        return Surname;
    }
    public class VerificationOfUser {
        //Initialization of the object for the special characters that will be used
        private static final String USERNAME_PATTERN = "^\\w{1,5}_\\w*$";
        private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";
        //Initializing the method for cheacking if the username is valid
        public static boolean ifUsernamieIsValid(String username) {
            Pattern pattern = Pattern.compile(USERNAME_PATTERN);
            Matcher matcher = pattern.matcher(username);
             return matcher.matches();
        }
        //Initializing the method for cheacking if the password is valid
        public static boolean ifPasswordIsValid(String password) {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(password);
            return matcher.matches();
        }
    }
}
