public class PrintSubsets1 {
    public static void printsubset(int i,String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        printsubset(i+1, s, ans+s.charAt(i)); //take
        printsubset(i+1, s, ans);  //not take
    }
    public static void main(String[] args) {
        String s = "abcd";
        printsubset(0,s," ");
    }
}
