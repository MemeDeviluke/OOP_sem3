public class Student extends User implements Comparable<Student>{
    private Integer studentID;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }


    public Student(Integer studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;

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
