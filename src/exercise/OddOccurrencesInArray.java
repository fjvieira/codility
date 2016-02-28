package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class OddOccurrencesInArray {
    
    public static void main(String[] args) {
	System.out.println(solution(new int[]{9,7,5,7,9}));
	System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	System.out.println(solution(new int[]{7, 3, 122, 3, 11110, 122 ,11110}));
    }
    
    public static int solution(int a[]){
	int number = 0;
	for (int i = 0; i < a.length; i++) {
	    number ^= a[i];
	}
	return number;

//	first solution	
//	loop1: for (int i = 0; i < a.length; i++) {
//	    int number = a[i];
//	    if (number != 0) {
//		a[i] = 0;
//
//		
//		for (int j = i+1; j < a.length; j++) {
//		    if(a[j]!= 0 && a[j] == number){
//			a[j] = 0;
//			continue loop1;
//		    }
//		}
//		return number;
//	    }
//	}
//	return 0;
    }
}
