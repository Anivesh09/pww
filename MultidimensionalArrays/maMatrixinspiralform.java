public class maMatrixinspiralform {

    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 10 }, { 10, 11, 12, 13 }, { 1, 2, 3, 4 } };
        print(arr);
        spiral(arr);
    }

    public static void spiral(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int maxr = m - 1;
        int maxc = n - 1;
        int minr = 0;
        int minc = 0;
        while (minr <= maxr && minc <= maxc) {
            // for (int i = minr; i <= minr; i++) {
            //     for (int j = minc; j <= maxc; j++) {
            //         System.out.print(arr[i][j] + " ");
            //     }
            // }   minr++;
            //above can be written as following
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }  minr++;

            // for (int i = maxc; i <= maxc; i++) {
            // for (int j = minr; j <=maxr; j++) {
            // System.out.print(arr[j][i]+" ");
            // }
            // }
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxc; j <= maxc; j++) {
                for (int i = minr; i <= maxr; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            maxc--;
            if (minr > maxr || minc > maxc)
                break;

            for (int i = maxr; i <= maxr; i++) {
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            maxr--;
            if (minr > maxr || minc > maxc)
                break;

            for (int j = minc; j <= minc; j++) {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            minc++;

        }
    }

}