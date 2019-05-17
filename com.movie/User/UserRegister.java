package User;

import java.util.Scanner;

public class UserRegister {

    Scanner scan;
    UserDB obj = new UserDB();

    public void RegisterUser(){
        scan = new Scanner(System.in);
        System.out.println("Enter Username to register");
        String userName =scan.nextLine();
        System.out.println("Enter a password");
        String password = scan.nextLine();
        obj.get(userName, password);
        System.out.println("You have successfully registered");
}




}
