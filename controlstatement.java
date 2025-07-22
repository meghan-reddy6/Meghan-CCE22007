public class controlstatement {
    public static void main(String[] args) {
        int score = 75;
        String day = "Tuesday";
        int counter = 0;

        System.out.println("--- If-Else Statements ---");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D or F");
        }

        System.out.println("\n--- For Loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        System.out.println("\n--- While Loop ---");
        while (counter < 3) {
            System.out.println("While loop iteration: " + counter);
            counter++;
        }

        System.out.println("\n--- Do-While Loop ---");
        int doWhileCounter = 0;
        do {
            System.out.println("Do-While loop iteration: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 2);

        System.out.println("\n--- Switch Statement ---");
        switch (day) {
            case "Monday":
                System.out.println("It's Monday, start of the week.");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday, a working day.");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday, hump day!");
                break;
            default:
                System.out.println("It's another day.");
        }
    }
}