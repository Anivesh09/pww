
public class Fractionadd {
    public static Fract add(Fract f1,Fract f2){
        int numerator = f1.num*f2.den+f2.num*f1.den;
        int denominator = f1.den*f2.den;
        Fract f3 = new Fract(numerator, denominator);
        return f3;
    }
    public static Fract mul(Fract f1,Fract f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        Fract f3 = new Fract(numerator, denominator);
        return f3;
    }
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);

        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0)
                return i;
        }
        return min;
    }

    public static class Fract {
        int num;
        int den;

        public Fract(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();  //can also be used as this
        }

        public  void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }

    }

    public static void main(String[] args) {
        Fract f1 = new Fract(3, 7);
        System.out.println(f1.num + "/" + f1.den);
        Fract f2 = new Fract(15, 21);

        System.out.println(f2.num + "/" + f2.den);
        // Fract f3 = add(f1,f2);
        // System.out.println(f3.num + "/" + f3.den);
        Fract f3 = mul(f1,f2);
        System.out.println(f3.num + "/" + f3.den);


    }
}

