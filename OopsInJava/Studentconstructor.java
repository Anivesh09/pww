public class Studentconstructor {
    
    public static void main(String[] args) {
        Student s1 = new Student("Vaibhav", 50, 95);
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.per);
        System.out.println(s1.numberOfStudents);

        Student s2 = new Student("Radhan", 52, 98);
        System.out.println(s2.numberOfStudents);

        Student s3 = new Student("Sachin", 30, 55);
        System.out.println(s3.numberOfStudents);
        System.out.println(s2.numberOfStudents);
        System.out.println(s3.numberOfStudents);
        


        // Student s2 = new Student();
        // s2.name = "ansh";
        // s2.rno = 69;
        // s2.per = 69;
        // System.out.println(s2.name);
        // System.out.println(s2.rno);
        // System.out.println(s2.per);

    }
}
