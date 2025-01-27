import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Input
        //There are two ways to get input from the user ie: Scanner or BufferedReader

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.in takes bytes as input
        //InputStreamReader converts bytes to characters
        //BufferedReader takes characters as input
        //BufferedReader throws IOException
//        System.out.println("Enter a String");
//        String s  = br.readLine();
//        System.out.println("You entered: " + s);
//        System.out.println("Enter a Integer");
//        int s  = Integer.parseInt(br.readLine());
//        System.out.println("You entered: " + s);

        //Scanner
        //Scanner takes characters as input
        //Scanner throws InputMismatchException
        //Scanner is more efficient
        //Scanner has inbuilt methods for different data types
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You entered String: " + s);
        int x = sc.nextInt();
        System.out.println("You entered Integer: " + x);
        float f = sc.nextFloat();
        System.out.println("You entered Float: " + f);

        //Comparison of Scanner and BufferedReader
        //BufferedReader is faster
        //BufferedReader is more flexible
        //BufferedReader is use for reading large input
        //Scanner is easy
        //For multiple threads bufferedReader is preferred as it is synchronized
    }
}