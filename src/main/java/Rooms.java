public class Rooms {

    //atributter
    private String name;

    private String description;

    private Rooms north;
    private Rooms east;
    private Rooms south;
    private Rooms west;


    //konstruktør
    public Rooms(String name) {this.name = name;}
    //todo laves setter og gettere der kan bruges i adventure klassen.

    public void setName(String name) {
        this.name = name;

    }
    public void setNorth(Rooms north){this.north = north;}
    public void setEast(Rooms east){this.east = east;}
    public void setWest(Rooms west){this.west = west;}
    public void setSouth(Rooms south){this.south = south;}

    public Rooms getNorth() {
        return north;
    }

    public Rooms getEast() {
        return east;
    }

    public Rooms getWest() {
        return west;
    }

    public Rooms getSouth() {
        return south;
    }
}


