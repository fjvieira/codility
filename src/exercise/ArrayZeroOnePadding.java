package exercise;

public class ArrayZeroOnePadding {
    
    public static void main(String...args){
	int[] input = new int[]{0,1};
	printArray(input);
	printArray(padding(input));
	input = new int[]{0, 1, 2};
	printArray(input);
	printArray(padding(input));
	input = new int[]{0, 1, 1, 0};
	printArray(input);
	printArray(padding(input));
	input = new int[]{1, 0, 0, 1, 1, 0, 0, 1};
	printArray(input);
	printArray(padding(input));	
	
    }
    
    public static void printArray(int[] array){
	System.out.print("[");
	for (int i = 0; i < array.length -1; i++) {
	    System.out.print(array[i] + ",");
	}
	System.out.println(array[array.length -1] + "];");
    }

    public static int[] padding(int[] input){

	int frontier = input.length - 1;
	for(int i = 0; i < frontier; i++){
	    if(input[i] == 0 && input[i+1] == 1){
		for(int j = i; j < frontier; j++) { 
		    if(j +  2 <= frontier){
			input[j] = input[j+2];
			
			if(j + 3 < frontier) {
			    input[j+1] = input[j+3];
			}
		    } else {
			input[j] = 0;
			input[j +1] = 0;
		    }
		    
		}	

	    }		

	}

	return input;

    }

}
