public class bsa1 {

    boolean func(int a, int b){
        int c = Integer.MIN_VALUE;
        int d = Integer.MIN_VALUE;

        while(a!=0){
            c=Math.max(c, a%10);
            a = a/10;
        }
         while(b!=0){
            d=Math.max(d, b%10);
            b = b/10;
        }
        if(c==d) return true;
        return false;
    }
    public static void main(String[] args) {
      int a = 28;
      int b = 73;
       boolean func(a,b);
        
    }
   
}
