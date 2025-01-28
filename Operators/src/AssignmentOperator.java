public class AssignmentOperator {

    // =, +=, -=, *=, /=, %=

    public static void main(String[] args) {
        int x = 10, y = 5;
        x += y; // x = x + y : ADD AND ASSIGN
        System.out.println(x);

        x %= y; // x = x % y : MOD AND ASSIGN
        System.out.println(x);

        int z = x = y; // z = x = y : ASSIGN AND ASSIGN Associativity is right to left
        System.out.println(z);
    }

}
