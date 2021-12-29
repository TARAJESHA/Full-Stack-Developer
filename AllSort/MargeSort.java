package AllSort;

public class MargeSort {
    public static void main(String[] args) {
        int[] array1 = {4,-1,0,1,1,2,8,11,19,23,99,99};
        int[] array2 = {-9,-9,-3,2,4,6,7,8,97,111,122};
        int[] mergedArray=getMargeSort(array1, array2);
        for(int i:mergedArray){
            System.out.print(i+" ");
        }
    }
    public static int[] getMargeSort(int[] L, int[] R) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[L.length + R.length];
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                res[k++] = L[i++];
            } else {
                res[k++] = R[j++];
            }
        }
        while (j < R.length)
            res[k++] = R[j++];

        while (i < L.length)
            res[k++] = L[i++];
        return res;
    }
}