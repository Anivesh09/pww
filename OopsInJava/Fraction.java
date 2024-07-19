public class Fraction {
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);

        for (int i = min; i >=1; i--) {
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
            // simplify();  //can also be used as this
        }

        public  void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }

    }

    public static void main(String[] args) {
        Fract f1 = new Fract(30, 75);
        System.out.println(f1.num + "/" + f1.den);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);


    }
}
