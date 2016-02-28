package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class PermCheck {
    
    public static void main (String...args){
	System.out.println(solution(new int[]{4,1,3,2}));
	System.out.println(solution(new int[]{4,1,3}));
	System.out.println(solution(new int[]{4,1,1,2}));
    }
    
    public static int solution(int[] a) {
	int[] b = new int[a.length];
	int count = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] < a.length + 1){
		if(b[a[i]-1] == 0) {
		    b[a[i]-1] = 1;
		    count++;
		}
	    }
	}
	
	return count == a.length ? 1 : 0;
    }
}
