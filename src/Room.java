import java.util.ArrayList;
public class Room {
    private static int roomIDCounter = 0;
    private static final char[] DIRECTIONS = new char[]{'N','S','E','W'};
    private final char floor;
    private final char direction;
    private final int num;
    public final int roomID;
    public Room(int floor, int direction, int num) {
        this.floor = (floor == 0)? 'B' : (char) (floor + '0');
        this.direction = DIRECTIONS[direction];
        this.num = num;
        roomIDCounter++;
        roomID = roomIDCounter;
    }

    @Override
    public String toString() {
        return "INSERT INTO Rooms (RoomName) VALUES (\"" + floor + direction + num + "\");";
    }

    public static ArrayList<Room> generateRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k < 21; k++) {
                    rooms.add(new Room(i,j,k));
                }
            }
        }
        return rooms;
    }
}
