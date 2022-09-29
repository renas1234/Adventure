public class Map {

    public Map (){

    Rooms room1 = new Rooms("room 1");
    Rooms room2 = new Rooms("room 2");
    Rooms room3 = new Rooms("room 3");
    Rooms room4 = new Rooms("room 4");
    Rooms room5 = new Rooms("room 5");
    Rooms room6 = new Rooms("room 6");
    Rooms room7 = new Rooms("room 7");
    Rooms room8 = new Rooms("room 8");
    Rooms room9 = new Rooms("room 9");

    //todo for hvert "room" skal der settes retning ved
        room1.setName("room1");

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setEast(room3);
        room2.setWest(room1);

        room3.setSouth(room6);
        room3.setWest(room2);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setNorth(room4);
        room7.setEast(room8);


        room8.setNorth(room5);
        room8.setEast(room9);
        room8.setWest(room7);

        room9.setNorth(room6);
        room9.setWest(room8);
    }
}
