package week2;

public class Encapsulation {

    int a = 5;

    {
        int b = 10;
        System.out.println(a);
    }
    //b = 5 will not work
    //inner block can access outer block but not vice versa
}
