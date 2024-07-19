

public class maTransposeofmatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 5, 6 }, { 2, 9, 3 } };
        int m =a.length;
        int n = a[0].length;
        System.out.println("Actual matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "      ");
            }
            System.out.println();
        }
        System.out.println();
        //calculating transpose
        int[][] tra = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
              tra[i][j] = a [j][i];  ;
            }
        }
        System.out.println();
        System.out.println("Transpose matrix: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tra[i][j] + "      ");
            }
            System.out.println();
        }
    }
}


