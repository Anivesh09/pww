public class Stud {
    
    String name;
    int roll;

     private static int ns;


    public Stud(String name, int roll) {
        this.name=name;
        this.roll = roll;
        ns++;
    }
    public static int  getns(){
        return ns;
    }
}
