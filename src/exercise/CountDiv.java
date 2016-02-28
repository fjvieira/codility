package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class CountDiv {

    
    public static void main (String[] x){
	System.out.println(solution(1,10,0));
	System.out.println(solution(0,10,1));
	System.out.println(solution(0,10,3));
	System.out.println(solution(1,10,3));
	System.out.println(solution(6,11,2));
    }
    
    public static int solution(int a, int b, int k) {
	if (k == 0 )
	    return 0;
	if (a % k == 0) {
	    return (b - a) / k + 1; 
	}  else {
	    return (b - (a - a % k)) / k;
	}
	//old solution
//	if (k == 0 )
//	    return 0;
//	int nDiv= 0;
//	for (int i = a; i <= b; i++) {
//	    if (i%k == 0) {
//		nDiv++;
//	    }
//	}
//	
//	
//	return nDiv;
	
    }
}
