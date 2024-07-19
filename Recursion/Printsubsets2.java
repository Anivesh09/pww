import java.util.ArrayList;

public class Printsubsets2 {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printsubset(int i,String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        printsubset(i+1, s, ans+s.charAt(i)); //take
        printsubset(i+1, s, ans);  //not take
    }
    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>();
        printsubset(0,s," ");
        System.out.println(arr);

    }
}
