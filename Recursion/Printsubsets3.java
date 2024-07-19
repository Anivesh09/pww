// import java.util.ArrayList;

// public class Printsubsets3 {
//     // static ArrayList<String> arr = new ArrayList<>();
//     public static void printsubset(int i,int[] a, int[] ans){
//         if(i==a.length){
//             // arr.add(ans);
//             System.out.println(ans[i]);
//             return;
//         }
//         // int[] ans = new int[a.length];
//         int add[] 
//         printsubset(i+1, a, ans + a[i]); //take
//         printsubset(i+1, a, ans);  //not take
//     }
//     public static void main(String[] args) {
//         int[] a = {1,2,3};
//         int[] ans = new int[a.length];
// // 
//         // arr = new ArrayList<>(); 
//         printsubset(0,a,ans);
//         // System.out.println(arr);

//     }
// }

class Printsubsets3 {
    static List<List<Integer>> arr;
    public void helper(int i, int[] nums, ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<ans.size(); j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
 }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0,nums,ans);
        return arr;
        
    }
}
