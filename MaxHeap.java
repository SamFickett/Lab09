package Lab9;
import java.util.Arrays;

public class MaxHeap {
    private int[] data;
    
    /**
     * @param data
     */
    public MaxHeap(int[]data)
    {
        this.setData(MaxHeapMaker.heapify(data));
    }
    
    /**
     * Remove the max value from the root of the tree while 
     * keeping the remaining the items as a max-heap
     * @return max value
     */
    public int delete()
    {
        int root = data[0]; //set root variable to first index
        data[0] = data[data.length-1]; //set last index as the new "root"
        data = Arrays.copyOf(data, data.length-1); //resize array to remove the last index
        MaxHeapMaker.heapify(data); //re-sort array
        
        return root; //return the root that was removed
    }
    
    /**
     * Adds new item to the max-heap
     * @param newData the input value to be added to the max-heap
     */
    public void add(int newData)
    {
        // Your code goes here
    }

    /**
     * @return Returns the max-heap
     */
    public int[] getData() {
        return data;
    }

    /**
     * Note that you might to need to 
     * @param data set the array
     */
    public void setData(int[] data) {
        this.data = MaxHeapMaker.heapify(data);
    }
}
