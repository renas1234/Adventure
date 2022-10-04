import java.util.Scanner;

public class Adventure {

    private Map map = new Map();
    private Player player = new Player();
    private Rooms currentRoom;//skal sættet til det rum vi er i
    private Userinterface userinterface = new Userinterface();



    public Adventure() {

    }

    public void play() {

        userinterface.printWelcome();

        //todo lav metode for going(north,east,south og west)


        //attribut
        String north = "go north";
        String east = "go east";
        String south = "go south";
        String west = "go west";

        //todo mangler en metode til at rykke mellem rum i adventure klassen
        //  north.equals(adventure.goingNorth());
        // east.equals((adventure.goingEast()));
        //south.equals(adventure.goingSouth());
        //west.equals(adventure.goingWest());


        String direction = userinterface.getDirection();

        if (direction.equals("north")) {
            System.out.println("Going north");
            player.moveNorth();
            if (player.getCurrentRoom().getNorth()!= null);
                else System.out.println("You cannot move this way");

        }

        if (direction.equals("east")) {
            System.out.println("Going east");
            player.moveEast();
            if (player.getCurrentRoom().getEast()!= null);
                else System.out.println("You cannot move this way");

        }
        if (direction.equals("south")) {
            System.out.println("Going south");
            player.moveSouth();
            if (player.getCurrentRoom().getNorth()!= null);
                else System.out.println("You cannot move this way");

        }
        if (direction.equals("west")) {
            System.out.println("Going west");
            player.moveWest();
            if (player.getCurrentRoom().getNorth()!= null);
                else System.out.println("You cannot move this way");


            // get current room
            // check if north room exists
            // move or print status
        }


    }


}

