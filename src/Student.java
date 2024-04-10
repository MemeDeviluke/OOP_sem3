public class Student implements Comparable<Student>{
    private Integer studentID;
    private String firstName;
    private String secondName;
    private String lastName;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Student stud) {
        if(stud.getStudentID() > studentID)
            return -1;
        else if(stud.getStudentID() < studentID)
            return 1;
        else
            return 0;
//        return studentID.compareTo(stud.getStudentID());
    }
}
