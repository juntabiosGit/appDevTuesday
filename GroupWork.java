import java.util.Scanner;
public class GroupWork   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCOLLAB CALCULATOR");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method

        System.out.println("Max: " + max(num1, num2)); // Group 8's method

	System.out.println("Product: " + Calculator.multiply(num1, num2)); // Group 3's method

        System.out.println("Cube: " + Calculator.cube(num1));  // Group 7's method
        



        System.out.println("The square of " + num1 + " is: " + Calculator.square(num1)); // Group 6's method
        System.out.println("Are numbers equal? " + Calculator.isEqual(num1, num2));  // Group 10's method

        scanner.close();
    }
}


        System.out.println("Difference: " + Calculator.subtract(num1, num2));    // Group 2's method

        System.out.println("Quotient: " + Calculator.divide(num1, num2));  // Group 4 Method
        System.out.println("Remainder: " + Calculator.remainder(num1, num2));  // Group 5's Method
        System.out.println("Are numbers equal? " + Calculator.isEqual(num1, num2));  // Group 10's method
        scanner.close();
    }
}
