
public class ma1 {
   public static void main(String[] args) {

    int[][] grid = new  int[4][4];
    grid[0][0] = 10;
    grid[0][1] = 20;
    grid[0][2] = 30;
    grid[1][0] = 40;
    grid[1][1] = 50;
    grid[1][2] = 60;
    grid[2][0] = 70;
    grid[2][1] = 80;
    grid[2][2] = 90;
  
    System.out.println(grid[2][1]);
    int m = grid.length;
    int n = grid[0].length;
    System.out.println("No of rows are : "+ m);
    System.out.println("No of columns are : "+ n);


    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
            System.out.print(grid[i][j]+" ");
        }
        System.out.println();
    }
   } 
}
