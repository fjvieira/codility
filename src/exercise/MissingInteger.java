package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class MissingInteger {

    public static void main (String...args){
	System.out.println(solution(new int[]{3,1,4,2,3,5,4}));
	System.out.println(solution(new int[]{3,1,4,2,3,1,4}));
	System.out.println(solution(new int[]{3,1,4,3,1,4}));
	System.out.println(solution(new int[]{1,2,3,4,5,6}));
	System.out.println(solution(new int[]{2,3,10,4,2,3,5,4}));
	System.out.println(solution(new int[]{2,-13,10,4,-2,3,-5,4}));
	System.out.println(solution(new int[]{1}));
	System.out.println(solution(new int[]{}));
    }
    
    public static int solution(int[] a){
	int[] b = new int[a.length];
	for (int i = 0; i < a.length; i++) {
	    if(a[i] > 0 && a[i] <= a.length) {
		b[a[i]-1] = 1;
	    }
	}	
	
	for (int i = 0; i < b.length; i++) {
	    if(b[i] == 0 )
		return i+1;
	} 
	
	return a.length + 1;
    }
    
    
}
