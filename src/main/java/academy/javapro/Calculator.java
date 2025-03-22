package academy.javapro;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Calculator <number1> <number2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Product: " + (num1 * num2));
        }
         catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers");
        }
    }
}
