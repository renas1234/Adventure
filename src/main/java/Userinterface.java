import java.util.Scanner;

public class Userinterface {

    private Scanner scanner = new Scanner(System.in); // tilføjer scanner

    public void printWelcome() {

        System.out.println("Hello hero and welcome to my maze");
        System.out.println("type 9 if you are 2 scared");
        System.out.println("press enter if you accept the dangers that awaits");
        System.out.println(scanner.nextLine());

    }
    public String getDirection() {
        System.out.println("Write go north to go north");
        System.out.println("Write go east to go east");
        System.out.println("Write go south to go south");
        System.out.println("Write go west go west");

        String direction = scanner.nextLine();
        return direction;


    }

}