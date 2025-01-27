import java.util.Scanner;

public class InputFloating {

//    Given a floating number, you need to input it. The floating number will then be print it after multiplying it by 10.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println(f*10);
    }

}
