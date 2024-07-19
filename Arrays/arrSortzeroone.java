public class arrSortzeroone {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0 };
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
        System.out.println();
        // two pass method
        // int noOfZeros = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0)
        // noOfZeros++;
        // }
        // /* for (int i = 0; i < noOfZeros; i++) {
        // arr[i] = 0;
        // }
        // for (int i = noOfZeros; i < n; i++) {
        // arr[i] = 1;
        // }
        // for (int i = 0; i < arr.length; i++) {

        // System.out.print(arr[i]);
        // } */
        // for (int i = 0; i < arr.length; i++) {
        // if(i<noOfZeros) arr[i] = 0;
        // else arr[i] = 1;
        // }

        // one pass method
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0)
                i++;
            else if (arr[j] == 1)
                j--;
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }

        }

        for (i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }
}
