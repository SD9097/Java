public class ArithmeticOperator {

    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println(x + y); // 30
        System.out.println(x - y);  // -10
        System.out.println(x * y);  // 200
        System.out.println(y / x);  // 2
        System.out.println(x % y);  // 10

        int z = (x+y*10); // 30 + 200 = 230 BODMAS Rule - Brackets, Order, Division, Multiplication, Addition, Subtraction
        System.out.println(z);

        z = x++; // x = x + 1 : POST INCREMENT which increments after the operation
        System.out.println(z);

        z = ++x; // x = x + 1 : PRE INCREMENT which increments before the operation
        System.out.println(z);
    }

}
