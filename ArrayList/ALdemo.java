package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ALdemo {
    public static void main(String args[]) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(2);
       // Collection.sort(numbers, Collection.reverseOrder());


        numbers.forEach(n-> System.out.println(n));// for each method
        for (int i=0; i< numbers.size(); i++){ // for loop
            System.out.println(numbers.get(i));
        }
        for(Integer n: numbers){  // for each loop
            System.out.println(n+" ");
        }




    }
}


