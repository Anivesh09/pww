public class arrMergetwosortedarrays {
    public static void main(String[] args) {
        int[] a = { 13, 15, 20, 25, 55 };
        int[] b = { 12, 18, 22, 45, 50, 66 };
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
            if (i == a.length) {
                while (j < b.length) {
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }
            if (j == b.length) {
                while (i < a.length) {
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }
        }
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
