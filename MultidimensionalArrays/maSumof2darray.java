
public class maSumof2darray {
    public static void main(String[] args) {
        int[][] a = { { 1, 5, 6 }, { 2, 9, 3 }, { 5, 18, 3 } };
        int[][] b = { { 4, 7, 12 } ,{ 10, 15, 16 }, { 20,19, 23 } };
        int[][] res = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               res[i][j]=a[i][j]+b[i][j];
            }
            // System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + "      ");
            }
            System.out.println();
        }
    }
}
