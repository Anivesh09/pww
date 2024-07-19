public class Stringtraversal2 {
    public static void skip(int i, String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        // if (s.charAt(i) != 'v')
        //     ans = ans + s.charAt(i);
        // skip(i + 1, s, ans);
        if (s.charAt(i) != 'v'){
            skip(i+1,s,ans + s.charAt(i));
        }
        else skip(i + 1, s, ans);
    }

    public static void main(String[] args) {
        String s = "Anivesh Raj";
        skip(0, s, " ");
    }
}
