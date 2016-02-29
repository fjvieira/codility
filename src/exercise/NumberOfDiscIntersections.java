package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class NumberOfDiscIntersections {

    public static void main(String...args) {
	System.out.println(solution(new int[] {}));
	System.out.println(solution(new int[] {1}));
	System.out.println(solution(new int[] {1,2}));
	System.out.println(solution(new int[] {2,2,3}));
	System.out.println(solution(new int[] {2,2,2}));
	System.out.println(solution(new int[] {1,5,2,1,4,0}));

    }

    public static int solution(int[] a){
	int n = 0;
	
	if(a.length > 1) {	
	    int length = a.length;

	    int[] graphIn = new int[length];
	    int[] graphOut = new int[length];

	    for (int i = 0; i < length; i++) {
		int left = (i - a[i]) > 0 ? i - a[i] : 0; 
//		int right = (i + a[i]) < length ? i + a[i] : length - 1;
		int right = (i + a[i]) >= length || i + a[i] < 0 ? length - 1 : i + a[i];

		graphIn[left]++;
		graphOut[right]--;
	    }

	    int currentGraphCount = 0;
	    for (int i = 0; i < length; i++) {
		if(graphIn[i] > 0) {
		    n += currentGraphCount * graphIn[i];
		    if(graphIn[i] > 1){
			n += graphIn[i] * (graphIn[i] - 1) / 2;
		    }
		}
		currentGraphCount += graphIn[i] + graphOut[i];
                if (n > 10000000) {  
                    return -1;  
                } 		
	    }
	}

	return n;	
	
//	//first solution
//	if(a.length > 1) {
//	    long[][] interval = new long[2][a.length];
//
//	    for (int i = 0; i < a.length; i++) {
//		interval[0][i] = i - a[i];
//		interval[1][i] = i + a[i];
//	    }
//
//	    for (int i = 0; i < a.length; i++) {
//		for (int j = i+1; j < a.length; j++) {
//		    if((interval[0][i] <= interval[1][j] && interval[0][j] <= interval[1][i])){
//			n++;
//			if(n > 10000000) {
//			    return -1;
//			}
//		    }
//
//		}
//	    }
//	}	
//
//	return n;
    }
}
