import java.util.ArrayList;

public class bsaMoveZerostoend {
        public static void main(String[] args) {
            int nums[] ={0,1,0,3,12};
            int n = nums.length;
            ArrayList<Integer> arr = new ArrayList<>();
            int noz= 0;
            for (int  ele : nums) {
                if(ele!=0) arr.add(ele);
                else noz++;
            }
        System.out.println(arr);

            for (int i = 0; i < noz; i++) {
                arr.add(0);
            }
        System.out.println(arr);

            for (int i = 0; i < n; i++) {
                nums[i] = arr.get(i);
        }
        System.out.println(arr);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }

}

// //leetcode
// class Solution {
//     public void moveZeroes(int[] nums) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         int noz = 0;
//         for(int ele: nums){
//             if(ele!=0) arr.add(ele);
//             else noz++;
//         }
//         for(int i=0;i<noz;i++){
//             arr.add(0);
//         }
//         for(int i=0; i<nums.length; i++){
//             nums[i]=arr.get(i);
//         }
//     }
// }
