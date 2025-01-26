public class TypeConversion {

    public static void main(String[] args) {
        //Type Conversion
        //Widening or Implicit Type Conversion
        //byte -> short to int -> char extend to int  -> long -> float -> double

        int x = 100;
        long y = x;
        float z = y;
        System.out.println(z);

        //Narrowing or Explicit Type Conversion
        //double -> float -> long -> int -> short -> byte
        //High chance of loss of data
        //It is forceful conversion
        double d = 65.4;
        int i = (int)d;
        char c = (char)i;
        System.out.println(i);
        System.out.println(c);
    }

}
