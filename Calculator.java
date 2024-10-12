import java.util.Scanner;

public class Calculator {
    public void calculate() {
        System.out.println("Select operation: \n1- Addition\n2- Subtraction\n3- Multiplication\n3- Division\"");
        Scanner myObj = new Scanner(System.in);
        String operator = myObj.nextLine();

        System.out.println("Enter first number:");
        int firstNumber = Integer.parseInt(myObj.nextLine());

        System.out.println("Enter first number:");
        int secondNumber = Integer.parseInt(myObj.nextLine());



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
    }
}
