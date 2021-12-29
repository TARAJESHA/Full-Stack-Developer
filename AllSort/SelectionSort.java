package AllSort;
/*
Selection Sort
        5 2 9 3 4 8 -2
        --> it will do less number first and swap the
        -2 2 9 3 4 8 5
        -2 2 3 9 4 8 5
        -2 2 3 4 9 8 5
        .
        .
        -2 2 3 4 5 8 9
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] number = {5, 2, 9, 3, 4, 8, -2};
        selectionSortNumber(number);
        for(int k=0; k < number.length; k++){
            System.out.print(number[k] + " ");
        }
        System.out.println("");
    }
        public static int[] selectionSortNumber(int[] number) {

        int numSize = number.length;
        for (int i = 0; i < numSize-1; i++) {
            int index=i;
            for (int j = i+1; j < numSize; j++) {
                if (number[j] < number[index]) {
                    index=j;

                }
            }
            int smallerNumber = number[index];
            number[index]=number[i];
            number[i]=smallerNumber;

        }
    return number;
    }

}

