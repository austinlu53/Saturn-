import java.util.ArrayList;
public class Room {
    private static ArrayList<Room> rooms;
    private static int roomIDCounter = 0;
    private static char[] directions = new char[]{'N','S','E','W'};
    private char floor;
    private char direction;
    private int num;
    private int roomID;
    public Room(int floor, int direction, int num) {
        this.floor = (floor == 0)? 'B' : (char) (floor + '0');
        this.direction = directions[direction];
        this.num = num;
        roomIDCounter++;
        roomID = roomIDCounter;
    }

    @Override
    public String toString() {
        return "(\"" + floor + direction + num + "\")";
    }

    public static void generateRooms() {
        rooms = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k < 21; k++) {
                    rooms.add(new Room(i,j,k));
                }
            }
        }
    }

    public static void printRooms() {
        System.out.println("INSERT INTO Rooms (RoomName) VALUES ");
        for (int i = 0; i < rooms.size()-1; i++) System.out.println(rooms.get(i) + ", ");
        System.out.println(rooms.getLast() + ";");
    }
    public static ArrayList<Room> getRooms() {
        return rooms;
    }
}
