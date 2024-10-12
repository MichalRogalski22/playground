import java.util.Scanner;

public class Calculator {
    public void calculate() {
        System.out.println("Select operation: \n1- Addition\n2- Subtraction\n3- Multiplication\n3- Division\"");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();

        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operator){
            case "1":
                System.out.println("Output is:" + (firstNumber + secondNumber));
                break;
            case "2":
                System.out.println("Output is:" + (firstNumber - secondNumber));
                break;
            case "3":
                System.out.println("Output is:" + (firstNumber * secondNumber));
                break;
            case "4":
                System.out.println("Output is:" + (firstNumber / secondNumber));
                break;
        }
        scanner.close();
    }
}
