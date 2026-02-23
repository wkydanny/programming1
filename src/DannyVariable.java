public class DannyVariable {

    public static void main(String[] args) {

        // =========================
        // Step 1: Primitives
        // =========================
        int myInt = 25;
        double myDouble = 19.99;
        char myChar = 'A';
        boolean myBoolean = true;

        System.out.println("=== Step 1: Primitive Variables ===");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
        System.out.println("Character value: " + myChar);
        System.out.println("Boolean value: " + myBoolean);


        // =========================
        // Step 2: Non-Primitives
        // =========================
        String myName = "Danny Wong";

        System.out.println("\n=== Step 2: Non-Primitive (String) ===");
        System.out.println("My name is: " + myName);


        // =========================
        // Step 3: Wrapper Classes
        // =========================
        System.out.println("\n=== Step 3: Wrapper Classes ===");

        // Wrap primitive int into Integer
        Integer wrappedInt = Integer.valueOf(myInt);

        // Convert primitive to String
        String intToString = wrappedInt.toString();
        System.out.println("Primitive int converted to String: " + intToString);

        // Convert String to primitive int
        String numberString = "123";
        int stringToInt = Integer.parseInt(numberString);
        System.out.println("String converted to primitive int: " + stringToInt);

        // Character wrapper checks
        char testChar = '7';
        System.out.println("Character to test: " + testChar);
        System.out.println("Is digit? " + Character.isDigit(testChar));
        System.out.println("Is letter? " + Character.isLetter(testChar));


        // =========================
        // Step 4: Type Casting
        // =========================
        System.out.println("\n=== Step 4: Type Casting ===");

        // Implicit casting (int to double)
        int intValue = 50;
        double implicitDouble = intValue; // automatic widening
        System.out.println("Implicit casting (int to double): " + implicitDouble);

        // Explicit casting (double to int)
        double doubleValue = 45.67;
        int explicitInt = (int) doubleValue; // fractional part removed
        System.out.println("Explicit casting (double to int): " + explicitInt);

        // Data loss example
        double bigDouble = 12345.9876;
        int dataLossInt = (int) bigDouble;
        System.out.println("Explicit casting causing data loss: " + dataLossInt);


        // =========================
        // Step 5: Autoboxing / Unboxing
        // =========================
        System.out.println("\n=== Step 5: Autoboxing / Unboxing ===");

        // Autoboxing
        Integer autoBoxed = myInt;  // primitive to wrapper
        System.out.println("Autoboxed Integer: " + autoBoxed);

        // Unboxing
        int unboxed = autoBoxed;    // wrapper to primitive
        System.out.println("Unboxed int: " + unboxed);
    }
}