//author: Nikan Kadkhodazadeh
package Lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeapMaker {
    /**
     * This method takes in an array of integers and returns a max-heap
     *
     * @param input array of integer values
     * @return input as a max-heap
     */
    public static int[] heapify(int[] input) {
        //make it a priority queue but reverse it to make it a max heap
        PriorityQueue<Integer> prq = new PriorityQueue<>(Collections.reverseOrder());
        //add all elements in the heap
        for (int in : input) {
            prq.add(in);
        }

//            make a temp integer array
        ArrayList<Integer> temp = new ArrayList<Integer>();
//              add them in
        for (int in : input) {
            temp.add(prq.poll());
        }
        //map the array list to the input array
        input = temp.stream().mapToInt(i -> i).toArray();

        return input;
    }

   
}
