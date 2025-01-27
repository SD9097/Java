import java.util.Scanner;

public class TypeCastAndDoubleIt {

    //Given an input num as a string. You need to typecast into an integer and double it.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        String s = sc.nextLine();
        System.out.println(Integer.parseInt(s) * 2);
    }

}
