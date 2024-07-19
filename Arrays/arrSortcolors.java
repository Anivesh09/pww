public class arrSortcolors {
    public static void main(String[] args) {
        int[] arr= {1,0,2,2,1,1,1,0,0,2,2};
        int n= arr.length;
        int noOfZeroes = 0, noOfOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
 }
 System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)  noOfZeroes++;
            if(arr[i]==1)  noOfOnes++;
}
        for (int i = 0; i < arr.length; i++) {
            if(i<noOfZeroes)  arr[i]=0;
           else if(i<noOfZeroes+noOfOnes)  arr[i]=1;
           else arr[i]=2;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
 }
    }
}
