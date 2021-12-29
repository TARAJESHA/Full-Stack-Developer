package Course4Module1;

import java.util.Scanner;

/*
Sample Input 1:
5
1 2 1 3 1
Sample Output 1:
1
Explanation 1:
In the input array, 1 occurs multiple times. Thus, 1 is the duplicate element in the array.
Sample Input 2:
10
1 1 5 6 3 5 9 4 6 1
Sample Output 2:
1
5
6
Explanation 2:
In the given input array, 1, 5 and 6 occur more than once and hence they get printed as duplicates.
Sample Input 3:
4
1 2 2 2
Sample Output 3:
2
 */
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        printDuplicates(arr);
    }

    static void printDuplicates(int[] arr) {
            int count=0;
            for (int i = 0; i <= arr.length-1; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }

                }
            }
            for (int i = 0; i <= arr.length-1; i++) {
                System.out.print(arr[i]);

            }
            System.out.println("*********");
            for (int i = 0; i < arr.length-1; i++) {

                    if(arr[i]==arr[i+1] && count!=1) {
                        System.out.print(arr[i]);
                        count = 1;
                    }
                    else {
                        count=0;
                    }

            }


            }
}


