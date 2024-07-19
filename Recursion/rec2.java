
public class rec2 {
    public static void mango() {
        System.out.println("I am mango.");
    }

    public static void banana() {
        mango();

        System.out.println("I am banana.");
    }

    public static void orange() {
        banana();

        System.out.println("I am orange.");
    }

    public static void apple() {
        orange();

        System.out.println("I am apple.");
    }

    public static void main(String[] args) {
        System.out.println("Hi, I am in main.");
        apple();
    }
}
