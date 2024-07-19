
public class Student{
    String name;
    // private int rno;  //for get and set
    int rno;
    double per;
    final String schoolname = "GGIS";
    static int numberOfStudents;
   

    //constructor
    public Student(){

    }
    // public Student(String naam,int roll,double percent){
    //     name = naam;
    //     rno = roll;
    //     per = percent;
    // }
    public Student(String name,int rno,double per){
        this.name = name;
        this.rno = rno;
        this.per = per;
        numberOfStudents++;
    }

    public int getRno(){
        return rno;
    }
    public void setRno(int roll){
        rno = roll;
    }
}