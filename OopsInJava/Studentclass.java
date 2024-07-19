public class Studentclass {
    public static class Student {
        String name;
        int rno;
        double per;
    }
    public static class car {
        String name;
        int price;
        String type;
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
        Student x = new Student();
        x.name = "Anivesh";
        x.rno = 12101212;
        x.per = 99;
        System.out.println(x.name);
        System.out.println(x);
        System.out.println(x.per+1);

        Student s = new Student();
        s.name = "Anivesh";
        s.rno = 12101214;
        s.per = 100;
        System.out.println(s.name);
        System.out.println(s);
        System.out.println(s.per+1);
        //car
        car c1 = new car();
        c1.name = "Alto";
        c1.price = 400000;
        c1.type = "sedan";
        System.out.println(c1.name);
        System.out.println(c1.price);
        System.out.println(c1.type);

        //Animal
          class animal {
            String name;
            int price;
            String type;
        }
        animal a2 = new animal();
        a2.name = "Parrot";
        a2.price = 400;
        a2.type = "flying";
        System.out.println(a2.name);
        System.out.println(a2.price);
        System.out.println(a2.type);

        

    }

}