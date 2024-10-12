import java.util.Scanner;

public class Car {
    private int speed = 0;
    private final String color;
    private final String brand;

    public Car(String color, String brand){
        this.color = color;
        this.brand = brand;
    }

    public void accelerate(){
        speed += 10;
        System.out.println("Bzium");
        System.out.println("Current speed is: " + speed);
    }

    public void slowDown(){
        if(speed > 0){
            speed -= 10;
            System.out.println("Current speed is: " + speed);
        } else {
            System.out.println("Car has stopped");
        }
    }

    public void showInfo() {
        System.out.println("Car color: "+ color + "\nCar Brand: " + brand + "\nCar speed: " + speed);
    }

    public void startCar(){
        boolean isOn = true;
        while (true) {
            if (!isOn){
                return;
            }
            System.out.println("Select action: \n1- Accelerate\n2- Slow down\n3- Show info\n4- Exit car");
            Scanner myObj = new Scanner(System.in);
            String operator = myObj.nextLine();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (operator){
                case "1":
                    accelerate();
                    break;

                case "2":
                    slowDown();
                    break;

                case "3":
                    showInfo();
                    break;

                case "4":
                    isOn = false;
                    if (speed > 0) {
                        System.out.println("You have jumped out of the car and broke your legs.");
                    } else {
                        System.out.println("You have forgot to use handbrake and now car is driving\ndown the hill without you");
                    }
                    break;

                default:
                    System.out.println("Inserted incorrect option!");
            }
        }
    }
}
