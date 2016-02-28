package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class MaxCounters {

    public static void main (String...args){
	printArray(solution(1, new int[]{1}));
	printArray(solution(1, new int[]{1,2}));
	printArray(solution(2, new int[]{1,3,2}));
	printArray(solution(4, new int[]{4,1,3}));
	printArray(solution(3, new int[]{4,1,1,2}));
	printArray(solution(5, new int[]{3,4,4,6,1,4,4}));
	printArray(solution(5, new int[]{6,6,6,6,6,6,6}));
	
    }
    
    public static void printArray(int[] array){
	System.out.print("[");
	for (int i = 0; i < array.length -1; i++) {
	    System.out.print(array[i] + ",");
	}
	System.out.println(array[array.length -1] + "];");
    }
    
    public static int[] solution(int n, int[] a){
	int[] count = new int[n];
	int maxTempCount = 0;
	int maxCount = 0;

	for (int i = 0; i < a.length; i++) {
	    int pos = a[i]-1;
	    if(a[i] > 0 && a[i] <= n) {
		if (maxCount > count[pos]) {
		    count[pos] = maxCount + 1;
		} else {
		    count[pos] = count[pos] + 1;
		}

		if (count[pos] > maxTempCount) {
		    maxTempCount = count[pos];    
		}
	    } else if (a[i] == n + 1) {
		maxCount = maxTempCount;
	    }

	}
	    
	for (int j = 0; j < count.length; j++) {
	    if (count[j] < maxCount) {
		count[j] = maxCount;
	    }
	}
	//old version
//	for (int i = 0; i < a.length; i++) {
//	    if(a[i] > 0 && a[i] <= n) {
//		int pos = a[i]-1;
//		count[pos] = count[pos] + 1;
//		if (count[pos] > maxCount) {
//		    maxCount = count[pos];    
//		}
//	    } else if (a[i] == n + 1) {
//		for (int j = 0; j < count.length; j++) {
//		    count[j] = maxCount;
//		}
//
//	    }
//		
//	}
	return count;
    }
}
