// Public class, accessible from anywhere
public class accessmodifier {

    // Public member: Accessible from anywhere
    public int publicVar = 10;

    // Private member: Accessible only within this class
    private String privateVar = "Private Data";

    // Protected member: Accessible within the package and by subclasses
    protected double protectedVar = 99.99;

    // Default (package-private) member: Accessible only within the same package
    int defaultVar = 50;

    // Final variable: Its value cannot be changed once initialized
    public final String MY_NAME = "Meghan";

    public void displayVariables() {
        System.out.println("--- AccessModifiersSet1 ---");
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
        System.out.println("Final Constant: " + MY_NAME);

    }

    public static void main(String[] args) {
        accessmodifier obj = new accessmodifier();
        obj.displayVariables();
    }
}