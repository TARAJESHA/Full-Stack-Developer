package Course4Module1;

import java.util.Scanner;

/*
Sample Input 1:
5
1 2 3 4 1
Sample Output 1:
2
Explanation 1:
In the input array, the element 1 is getting repeated and the elements that are not getting repeated are 2, 3 and 4. So the first non-repeating character will be 2.
Sample Input 2:
10
1 1 5 6 3 5 9 4 6 1
Sample Output 2:
3
Explanation 2:
In the input array when you move ahead sequentially based on index, element 1 is getting repeated. Also, elements 5 and 6 get repeated later in the array. Next, element 3 does not seem to get repeated in the array and hence element 3 gets printed.
Sample Input 3:
4
1 2 1 2
Sample Output 3:
All elements are repeated
Explanation 3:
The array as elements 1 2 1 2
So here, the element 1 and 2 are both getting repeated and thus, the program prints, "All elements are repeated"
 */


public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int answer = firstNonRepeating(arr);
        if (answer != 0)
            System.out.print(answer);
        else
            System.out.print("All elements are repeated");
    }

    static int firstNonRepeating(int arr[]) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    index++;
                    System.out.println("idex "+index);
                }

            }
            if (index == 0) {
                 count = i;
                System.out.println("count"+ count);
                count=arr[count];
                break;
            }
        }

            return count;
        }
    }

