
public class sort {
	int []array;
	public int[] sortArray(int []array){
		//int []array = {5,8,2,1,3,0,1,7};
		this.array = array;
	    int min = 0;
	    int temp;
	    
	    for (int k = 0; k < array.length - 1; k++) {
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i + 1]) {
	                temp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = temp;
	            }
	        }
	    }
	    return array;
	    
	}
}
