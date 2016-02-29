package exercise;

import java.util.Arrays;

/**
 * @author Fernando Jose Vieira
 *
 */
public class Triangle {

    
    public static void main(String...args) {
	System.out.println(solution(new int[] {}));
	System.out.println(solution(new int[] {1}));
	System.out.println(solution(new int[] {1,2}));
	System.out.println(solution(new int[] {2,2,3}));
	System.out.println(solution(new int[] {2,2,2}));
	System.out.println(solution(new int[] {10,2,5,1,8,20}));
	System.out.println(solution(new int[] {10,50,5,1}));

    }
    
    public static int solution(int[] a){
	if(a.length <3){
	    return 0;
	}
	
	Arrays.sort(a);
	//if a[i]>0, a[i+2]>a[i+1]>a[i]  => a[i] + a[i+1] > a[i+2] is enough condition. 
	for (int i = 0; i < a.length - 2; i++) {
	    if ((a[i]> 0) && (a[i] > (a[i+2] - a[i+1]))){
		return 1;
	    }
	}
	
	
	return 0;
    }
}
