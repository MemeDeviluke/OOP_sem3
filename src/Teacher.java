public class Teacher extends User implements Comparable<Teacher>{
    private Integer teacherID;
    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        if(o.getTeacherID() > teacherID)
            return -1;
        else if(o.getTeacherID() < teacherID)
            return 1;
        else
            return 0;
    }
}
