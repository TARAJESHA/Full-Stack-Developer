package Course4Module1;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        int[] res=mergeSortedArrays(arr1, arr2);
        for(int i:res){
            System.out.println(i+" ");
        }
    }

    public static int[] mergeSortedArrays(int arr1[], int arr2[]) {
        // write your code here
        int L = 0, R = 0, K = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (L < arr1.length && R < arr2.length) {
            if (arr1[L] <= arr2[R]) {
                res[K++] = arr1[L++];
                System.out.println("if"+res[K]);
            }
            else {
                res[K++] = arr2[R++];
                System.out.println("else"+K);
            }
        }
        while (R < arr2.length) {
            res[K++] = arr2[R++];
            System.out.println("whileR" + res[K]);
        }
        while (L < arr1.length) {
            res[K++] = arr1[L++];
            System.out.println("whileL" + res[K]);
        }
        return res;
        }
}

