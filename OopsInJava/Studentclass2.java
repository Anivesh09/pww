public class Studentclass2 {
    public static class Student{
        String name;
        int rno;
    }
    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args){
        Student x = new Student();
        x.name = "Ani";
        x.rno = 12;
        fun(x);
    }
}
