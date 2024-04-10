import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "a" , "A", "1");
        Student student2 = new Student(2, "A" , "A", "2");
        Student student3 = new Student(3, "B" , "B", "3");
        Student student4 = new Student(4, "C" , "B", "4");
        Student student5 = new Student(5, "D" , "A", "5");
        Student student6 = new Student(6, "C" , "B", "6");
        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.add(student3);
        studentGroup1.add(student4);
        studentGroup1.add(student2);
        StudentGroupService service = new StudentGroupService(studentGroup1);
        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.add(student1);
        studentGroup2.add(student6);
        StudentGroupService service1 = new StudentGroupService(studentGroup2);
        StudentGroup studentGroup3 = new StudentGroup();
        studentGroup3.add(student5);
        StudentGroupService service2 = new StudentGroupService(studentGroup3);

        Stream stream1 = new Stream();
        stream1.add(studentGroup2);
        stream1.add(studentGroup1);
        Stream stream2 = new Stream();
        stream2.add(studentGroup3);

        for (Student student: studentGroup1){
            System.out.println(student);
        }
        System.out.println();
        for (Student student: service.getSortedStudentGroup()){
            System.out.println(student);
        }
        System.out.println();
        for (Student student: service.getSortedStudentGroupByFio()){
            System.out.println(student);
        }
        System.out.println();
        for (StudentGroup group: stream1){
            System.out.println(group);
        }
        System.out.println();
        for (StudentGroup group: stream2){
            System.out.println(group);
        }

        List<Stream> streams = new ArrayList<>();
        streams.add(stream2);
        streams.add(stream1);
        System.out.println();
        for (Stream stream: streams){
            System.out.println(stream);
        }

    }
}