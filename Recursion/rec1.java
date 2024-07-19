
public class rec1 {
    public static void mango() {
      System.out.println("I am mango.");  
    }
    public static void banana() {
        System.out.println("I am banana.");
        mango();
      }
      public static void orange() {
        System.out.println("I am orange.");
       banana();  
      }
      public static void apple() {
        System.out.println("I am apple."); 
        orange();
      }
    public static void main(String[] args) {
        System.out.println("Hi, I am in main.");
        apple();
    }
}
