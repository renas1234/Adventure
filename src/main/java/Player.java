
public class Player {


    private Rooms currentRoom;

    public Rooms getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Rooms currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean moveNorth() {
        Rooms roomnorth = getCurrentRoom().getNorth();
        if (roomnorth == null) {
            return false;
        } else {
            setCurrentRoom((roomnorth));
            return true;

            public boolean moveEast () {
                Rooms roomeast = getCurrentRoom().getEast();
                if (roomeast == null) {
                    return false;
                } else {
                    setCurrentRoom((roomeast));
                    return true;
                }

                public boolean moveSouth () {
                    Rooms roomsouth = getCurrentRoom().getSouth();
                    if (roomsouth == null) {
                        return false;
                    } else {
                        setCurrentRoom((roomsouth));
                        return true;
                    }


                    public boolean moveWest () {
                        Rooms roomwest = getCurrentRoom().getWest();
                        if (roomwest == null) {
                            return false;
                        } else {
                            setCurrentRoom((roomwest));
                            return true;

                        }
                    }
                }
            }
        }
    }

    public void moveEast() {
    }
    public void moveSouth() {
    }
    public void moveWest() {
    }
}
}