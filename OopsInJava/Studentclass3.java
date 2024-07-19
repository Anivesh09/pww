/* classes me pass by reference hota hain matalab
 * ki pahle value same rahega fir function me jayega
 * to value change ho jayega
 */


public class Studentclass3 {
    public static class Student{
        String name;
        int rno;
    }
    public static void change(Student s){
        s.name = "Kunal";
        return;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Raj";
        s1.rno = 9;
        System.out.println(s1.name);

        change(s1);
        System.out.println(s1.name);
    }
}
