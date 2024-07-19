class car{
    int price;
    String name;
    car(int price, String name){
        this.price = price;
        this.name = name;
    }
}
public class ll1 {
     
    public static void main(String[] args) {
        car c1 = new car(12000, "kia sonet");
        System.out.println(c1.name);
    }
}
