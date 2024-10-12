import java.util.Scanner;

public class Choinka {
    public void draw(){
        System.out.println("Podaj szerokość choinki");
        Scanner myObj = new Scanner(System.in);
        int szerokość = Integer.parseInt(myObj.nextLine());
        System.out.println(" ".repeat(szerokość) + "*");
        for (int i = 1; i <= szerokość; i++) {
            if(i > 1){
                System.out.println(" ".repeat(szerokość - i) + "*" + " ".repeat( i +i -1) + "*");
            } else {

                System.out.println(" ".repeat(szerokość - i) + "*" + " ".repeat(i) + "*");
            }
        }
        String podstawa = "* ".repeat(szerokość +1);
        System.out.println(podstawa);
    }
}
