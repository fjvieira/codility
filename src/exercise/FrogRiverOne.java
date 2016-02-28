package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class FrogRiverOne {

    public static void main (String...args){
	System.out.println(solution(5, new int[]{3,1,4,2,3,5,4}));
	System.out.println(solution(5, new int[]{3,1,4,2,3,1,4}));
	System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
	System.out.println(solution(5, new int[]{1}));
	System.out.println(solution(1, new int[]{1}));
    }
    
    
    public static int solution(int x, int[] a){
	int[] path = new int[x];
	int pathCount = 0;
	
	for (int i = 0; i < a.length; i++) {
	    if(path[a[i]-1] == 0){
		path[a[i]-1] = 1;
		pathCount++;
		if(pathCount == x) {
		    return i;
		}
	    }
	}	
	return -1;
    }
}
