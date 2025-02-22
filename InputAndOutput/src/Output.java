public class Output {

    public static void main(String[] args) {
        //Java Output
        //There are mainly four methods to produce output on a screen
        //System.out.println();
        //System.out.print(); The difference between above two is that 1st prints a new line and second not. It converts all the data into a string
        //System.out.format();
        //System.out.printf(); The above two methods are same

//        int x = 10, y = 20;
//        char z = 'G';
//        String str = "GFG";
//
//        System.out.println(x);
//        System.out.println(x+y);
//        System.out.println(x+" "+y);
//        System.out.print(str+" ");
//        System.out.print("Courses\n");//Prints a new line

        int x = 100;
        System.out.format("Value of x is %d\n",x);
        Float y = (float) Math.PI;
        System.out.println(y);
        System.out.format("Value of PI=%.2f",y);
        System.out.format("Value of PI=%5.2f",y);
        System.out.format("Value of PI=%05.2f",y);
        System.out.format("x = %d, y = %.2f",x,y);

    }

}
