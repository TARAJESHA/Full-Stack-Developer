package AllSort;

/*bubble Sort, insertion Sort, selsection Sort, merge Sort, heap Sort, quick Sort, bucket Sort, radix Sort, counting Sort

bubble Sort
5 2 9 3 4 8 -2
--> it will do assending order
2 5 9 3 4 8 -2
2 5 3 4 8 -2 9
2 3 4 5 -2 8 9
2 3 4 -2 5 8 9
.
.
-2 2 3 4 5 8 9
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] number = {5, 6, 9, 3, 4, 8, -2};

        for (int i = 0; i < number.length; i++) {
            for (int j = 1; j < number.length-i; j++) {
                if (number[j-1] > number[j]) {
                    int temp = number[j-1];
                    number[j-1] = number[j];
                    number[j]=temp;
                }

            }
            for(int k=0; k < number.length; k++){
                System.out.print(number[k] + " ");
            }
            System.out.println("");


        }

    }
}
