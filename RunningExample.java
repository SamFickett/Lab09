public class RunningExample {

	public static void main(String[] args) {
		int[] input = {4, 56, 13, 18, 93, 75, 23, 43, 46, 32, 87, 63};
		int[] output = HeapSort.sort(input);
		
		System.out.print("{");
		for (int i = 0; i < output.length; ++i) {
      if (i == output.length - 1) {
        System.out.print(output[i]);
      }
      else {
			  System.out.print(output[i] + ", ");
      }          
		}
		System.out.println("}");
	}

}
