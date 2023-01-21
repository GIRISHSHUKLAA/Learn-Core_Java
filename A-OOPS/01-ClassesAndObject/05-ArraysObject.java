class Student {
    int rollno;
    String name;
    int marks;

}

public class ArrayObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Saurbhi";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Ram";
        s2.marks = 32;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Saurbh";
        s3.marks = 57;

        Student[] Students = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for (Student student : Students) {
            System.out.println(student.name + ": " + student.marks);
        }
    }
}
