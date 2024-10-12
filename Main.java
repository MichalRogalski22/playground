import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int number = 5;

        float secondNumber = 20.0002f;

        System.out.println(number + secondNumber);
        System.out.println("Select operation: \n1- Calculator\n2- Pies\n3- Multiplication\n3- Choinka\n4- Car");
        Scanner myObj = new Scanner(System.in);
        String operator = myObj.nextLine();


        switch (operator) {
            case "1":
                // Calculator
                Calculator calculator = new Calculator();
                calculator.calculate();
                break;
            case "2":
                // pies
                pies labrador = new pies();
                labrador.bark();
                break;
            case "3":
                // Choinka
                Choinka choinka = new Choinka();
                choinka.draw();
            case "4":
                // Car
                Car car = new Car("Red", "Toyota");
                car.startCar();
        }
    }
}

