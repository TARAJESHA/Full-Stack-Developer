package AllSort;

public class MargeSort1 {
    public static void main(String[] args) {
    int[] arr = {-22, 12, -99, 3, -22, 38, 5, -92, 0, 87, 43, 76};
    mergeSort(arr, 0, arr.length - 1);
        for(int i: arr){
        System.out.print(i+" ");
    }
}

    public static void mergeSort(int[] arr, int l, int r){
        int m = l + (r-l)/2;
        if(l<r) {
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1, n2= r-m;
        // Create L & R array
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1; i++)
            L[i] = arr[l + i];
        for(int i=0; i<n2; i++)
            R[i] = arr[m+ 1 + i];

        int i=0, j=0, k=l;

        // while there's at least one element in each of the array to compare
        while(i < L.length && j < R.length) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        // left array is completely processed,
        // copying leftover elements from the right array
        while(j < R.length)
            arr[k++] = R[j++];

        // right array is completely processed,
        // copying leftover elements from the left array
        while(i < L.length)
            arr[k++] = L[i++];
    }

}


