public class datatypes {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 127;         // -128 to 127
        short myShort = 32767;     // -32,768 to 32,767
        int myInt = 2_000_000_000; // Commonly used integer type
        long myLong = 9_000_000_000_000_000_000L; // Suffix 'L' for long literal

        System.out.println("Integer Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);

        // Floating-point types
        float myFloat = 3.14159f;  // Suffix 'f' for float literal
        double myDouble = 3.1415926535; // Default for decimal numbers

        System.out.println("\nFloating-Point Types:");
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);

        // Character type
        char myChar = 'A';
        System.out.println("\nCharacter Type:");
        System.out.println("char: " + myChar);

        // Boolean type
        boolean myBoolean = true;
        System.out.println("\nBoolean Type:");
        System.out.println("boolean: " + myBoolean);
    }
}