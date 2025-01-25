public class Main {
    public static void main(String[] args) {
        //Variable is a way to access and store data
        //There are different types of data to store the data there are different datatypes
        //Every datatype has different range of data and amount of memory to be allocated
        //As Java is statically typed language we need to declare the type of the variable
        //Variable Naming Convention - CamelCase it can contain A-Z, a-z, 0-9, _, $
        //Variable name should not begin with a number and keywords are not allowed
        //For declaring constants variable name should be in UPPERCASE and separated by _

        //Type of variable
        //1. Primitive Data Types
        //2. Non-Primitive Data Types

        //1. Primitive Data Types
        //byte -128 to 127 bytes or -2^7 to 2^7-1 . In here 1 bit is used to store the sign and other 7 bits are used to store the value
        //short -32768 to 32767 bytes or -2^15 to 2^15-1
        //int -2147483647 to 2147483647 bytes or -2^31 to 2^31-1
        //long -9223372036854775807 to 9223372036854775807 bytes or -2^63 to 2^63-1
        //float 1.4E-45 to 3.4028235E38 Single Precision 32 bit
        //double 4.9E-324 to 1.7976931348623157E308  Double Precision 32 bit
        //char 0 to 65535 or 0 to 2^16-1 (It stores unicode characters)
        //boolean true or false

        //Note: int and long only store whole numbers

        boolean isValid = true;
        byte marks = 90;
        float pi = 3.14f;
        float div = 2.0f/3.0f;
        long views = 100000000;
        char gender = 'M';
        System.out.println("The value of pi is "+ pi);
        System.out.println("The value of div is "+ div);
        System.out.println("The value of views is "+ views);
        System.out.println("The value of gender is "+ gender);
        System.out.println("Is it valid "+ isValid);
        System.out.println("The marks is "+ marks);
    }
}