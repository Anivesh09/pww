

public class maRowiseColwiseprinting {
    public static void main(String[] args) {
        int[][] a = { { 1, 5, 6 }, { 2, 9, 3 }, { 5, 18, 3 } };
        int m =a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "      ");
            }
            System.out.println();
        }
        System.out.println();
        // for (int j = 0; j < n; j++) {
        //     for (int i = 0; i < m; i++) {
        //         System.out.print(a[i][j] + "      ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + "      ");
            }
            System.out.println();
        }
    }
}

