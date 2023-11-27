public class HeapSort {
    
    /**
     * This method takes in an array on integers and sort them using heap-sort
     * @param input array of integer items
     * @return sorted array
     */
    public static int[] sort(int[]input)
    {
        MaxHeap maxHeap = new MaxHeap(input);
        // Your code goes here
        // Creator: Samuel Fickett
        int[] output = new int[maxHeap.getData().length];
        for (int i = 0; i < maxHeap.getData().length; ++i) {
        	int a = maxHeap.delete();
        	output[i] = a;
        }
        
        /*
         * This for loop sorts the array once
         * all data has been removed from the 
         * max heap
         */
        for (int i = 0; i < output.length; ++i) {
        	for (int j = i; j < output.length; ++j) {
        		if (output[j] > output[i] && i != j) {
        			int temp = output[j];
        			int temp2 = output[i];
        			output[j] = temp2;
        			output[i] = temp;
        		}
        	}
        }
        
        // You might change this line and return the sorted array
        return output;
    }
}
