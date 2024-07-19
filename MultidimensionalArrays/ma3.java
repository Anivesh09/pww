public class ma3 {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,9,3},{5,18,3},{4,7,12}};
       int mx = Integer.MIN_VALUE;
       int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"      ");
            }
            System.out.println();
         } 
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                mx = Math.max(arr[i][j],mx);
            }
      
         } 
         System.out.println("Largest element is: "+mx);
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum+ arr[i][j];
            }
      
         } 
         System.out.println("Sum of element is: "+sum);

    }
}
