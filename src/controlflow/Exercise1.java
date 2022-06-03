//Write program get temperature and weather (true) for sunny from user..
//Display it is hot outside or not. Print it is sunny day or not depending on the user input.

package controlflow;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        Scanner weather = new Scanner(System.in);

        int temp = 0;
        boolean sunny = weather.nextBoolean();

        if(temperature.hasNextInt() == true) temp = temperature.nextInt();
        System.out.println("Enter temperature");
        if(weather.hasNextBoolean()== true) sunny= weather.nextBoolean();
        System.out.println("Enter weather");

        if(temp >= 90){
            System.out.println("It is hot outside.");
            if(sunny == true){
                System.out.println("It is a sunny day.");
            }
            else {
                System.out.println("It is not a sunny day.");
            }
        }
        else{
            System.out.println("It is not hot outside.");
            if(sunny == true) System.out.println("It is a sunny day.");
            else System.out.println("It is not a sunny day.");

        }

    }

}
