package Java.Strings;

import java.util.Scanner;

public class Login {

    private String userName;
    private String password;

    public Login(String uName, String pass) {
        this.userName = uName;
        this.password = pass;
    }

    public void setuserName(String uName) {
        this.userName = uName;
    }

    public String getUserName() {
        return userName;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }

    public String getpassword() {
        return password;
    }

    public boolean validate() {
        if (this.userName.matches("^[a-zA-Z0-9@.]+$") && this.password.matches("^[a-zA-Z0-9!@#$%^&*()_?<>,.:;]+$")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your UserName");
        String userName = sc.next();
        System.out.println("Enter your Password");
        String password = sc.next();
        Login obj = new Login(userName, password);

        if (obj.validate()) {
            System.out.println("Sucessfully Authenticated");
        } else {
            System.out.println("Incorrect username or password");
        }
        sc.close();
    }
}
