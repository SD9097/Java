package fc;

import java.util.Scanner;

public class typeOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("Zero");
        } else if (number > 0) {
            if(isEven(number)){
                System.out.println("Positive Even");
            }else{
                System.out.print("Positive Odd");
            }
        } else{
            if(isEven(Math.abs(number))){
                System.out.println("Negative Even");
            }else{
                System.out.print("Negative Odd");
            }
        }

    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
