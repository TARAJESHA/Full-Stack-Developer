package Course4Module1;

import java.util.Scanner;

/*
Maximum product
        Description
        Write a program which calculates the maximum product between the two elements in the given array.
        Input Format:
        Size of the array
        Elements of the array
        Output Format:
        Maximum product

        sample Input 1:
        5
        2 4 3 14 6
        Sample Output 1:
        84
        Explanation 1:
        14*6 is the largest product possible.
        Sample Input 2:
        3
        6 10 7
        Sample Output 2:
        70
        Explanation 2:
        10*7 is the largest product possible.*/
public class MaximumProduct {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = maxProduct(arr);
        System.out.print(answer);

    }

    static int maxProduct(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("NA");
            return Integer.MIN_VALUE;
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println(" ");
        return arr[n-1]*arr[n-2];


    }





}
