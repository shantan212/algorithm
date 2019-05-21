package sorting;



public class BubbleSortAlgorithm {

	//Unsorted Array, i.e, the array to be shorted
	private static int[] sortArray={14,25,75,2,7,3,5,67};
	
	//Main Method 
	public static void main(String args[]){
		bubbleSortArray();
		print();
	}
	
	
	// Bubble sorting logic
	public static void bubbleSortArray(){
		for (int i=0 ; i <sortArray.length ;i++){
			for (int j = 0; j<sortArray.length-1; j++){
				if( sortArray[j] > sortArray[j+1]){
					swap(j,j+1);
				}
			}
		}
	}
	
	// Logic to Swap
	public static void swap(int sourceIndex,int destinationIndex){
		int temp= sortArray[sourceIndex];
		sortArray[sourceIndex] =sortArray[destinationIndex];
		sortArray[destinationIndex]= temp;
	}

	//Printing the output
	public static void print(){
		for (int i=0 ; i <sortArray.length ;i++){
			System.out.println(sortArray[i]);
		}
	}
}
