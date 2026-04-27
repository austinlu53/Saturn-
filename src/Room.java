public class Room {
    private final char[] DIRECTIONS = new char[]{'N','S','E','W'};
    private final char floor;
    private final char direction;
    private final int num;
    public Room(int floor, int direction, int num) {
        this.floor = (floor == 0)? 'B' : (char) floor; //floor must be 0-8
        this.direction = DIRECTIONS[direction]; //direction must be 0-3
        this.num = num; //num must be 1-20
    }


    @Override
    public String toString() {
        return "INSERT INTO Rooms (RoomName) VALUES (\"" + floor + direction + num + "\");";
    }
}
