public class scanops {
    public static void main(String[] args) {
        String operation = "subtract";
        int value1 = 50;
        double value2 = 25.5;

        System.out.println("Operation: " + operation);
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);

        // Example operation based on hardcoded values
        if (operation.equals("subtract")) {
            System.out.println("Result of subtraction: " + (value1 - value2));
        }
    }
}