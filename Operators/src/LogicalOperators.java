import java.util.Scanner;

public class LogicalOperators {

    // Logical Operators
    // &&, ||, !

    public static void main(String[] args) {
//        String userName = "Sd", password = "123";
//        Scanner sc = new Scanner(System.in);
//        String iUserName = sc.nextLine();
//        String iPassword = sc.nextLine();
//
//        //when both conditions are true then it returns true or false
//        if(userName.equals(iUserName) && password.equals(iPassword)) {
//            System.out.println("Login Successful");
//        }else {
//            System.out.println("Login Failed");
//        }

//        boolean x = true, y = false;
//        System.out.println(x && y); // false
//        System.out.println(x || y); // true
//        System.out.println(!x); // false

        //Short Circuiting
        String s = null;

        if(s != null && s.length() > 0) {
            System.out.println("String is not empty");
        }else {
            System.out.println("String is empty");
        }
    }

}
