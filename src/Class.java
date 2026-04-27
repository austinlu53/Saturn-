public class Class {
    private int courseID;
    private int period;
    private int roomID;

    public Class(int courseID, int period, int roomID) {
        this.courseID = courseID;
        this.period = period;
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Classes (CourseID,PeriodNumber,RoomID) VALUES (" + courseID + "," + period + "," + roomID + ");";
    }
}
