public class Student {
    private String student_firstname;
    private String student_lastname;

    public Student(String student_firstname,String student_lastname){
        this.student_firstname = student_firstname;
        this.student_lastname = student_lastname;

        for (int i = 0; i < 10; i++) {
            new StudentGenerator()
        }
    }

    public String toString() {
        return ("INSERT INTO Students (StudentFirstName,StudentLastName) " +
                "VALUES ("+"'"+student_firstname+"'"+","+"'"+student_lastname+"'"+");");
    }
}
