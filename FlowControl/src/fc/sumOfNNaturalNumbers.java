package fc;

import java.util.Scanner;

public class sumOfNNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sumofN(n));
    }

    public static int sumofN(int n) {
        return (n * (n + 1) / 2);
    }

}
