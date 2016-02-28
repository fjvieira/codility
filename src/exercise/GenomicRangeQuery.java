package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class GenomicRangeQuery {
    
    public static void main(String[] args) {
	printArray(solution("A", new int[]{0}, new int[]{0}));
	printArray(solution("C", new int[]{0}, new int[]{0}));
	printArray(solution("G", new int[]{0}, new int[]{0}));
	printArray(solution("T", new int[]{0}, new int[]{0}));
	printArray(solution("TGCA", new int[]{0,1,2,3,0,1,2}, new int[]{0,1,2,3,1,2,3}));
	printArray(solution("AACCAACC", new int[]{0,2,0,0}, new int[]{1,2,3,4}));
	printArray(solution("GTGTGTG", new int[]{2,5,0}, new int[]{4,5,6}));
	printArray(solution("CAGCCTA", new int[]{0,2,5,0}, new int[]{0,4,5,6}));
    }
    
    public static void printArray(int[] array){
	System.out.print("[");
	for (int i = 0; i < array.length -1; i++) {
	    System.out.print(array[i] + ",");
	}
	System.out.println(array[array.length -1] + "];");
    }
    
    public static int[] solution(String s, int[] p, int[] q){
	int[] minImpact = new int[p.length];
	int[][] comput = new int[4][s.length() + 1];
	//computes cumulative occurrences of ACGT
	for (int i = 0; i < s.length(); i++) {
	    	int compA = comput[0][i];
	    	int compC = comput[1][i];
	    	int compG = comput[2][i];
	    	int compT = comput[3][i];
	    	
		switch (s.charAt(i)) {
		case 'A':
		    compA++;
		    break;
		case 'C':
		    compC++;
		    break;
		case 'G':
		    compG++;
		    break;
		case 'T':
		    compT++;
		    break;
		default:
		    break;
		}
		comput[0][i+1] = compA;
		comput[1][i+1] = compC;
		comput[2][i+1] = compG;
		comput[3][i+1] = compT;		
	}
	
	//Starting from the min impact, if there is a occurrence of x in the interval, it will be the minimum. 
	for (int j = 0; j < p.length; j++) {
	    int fromIndex = p[j];
	    int toIndex = q[j] + 1;
	    if(comput[0][toIndex] - comput[0][fromIndex] > 0)
		minImpact[j] = 1;
	    else if(comput[1][toIndex] - comput[1][fromIndex] > 0)
		minImpact[j] = 2;
	    else if(comput[2][toIndex] - comput[2][fromIndex] > 0)
		minImpact[j] = 3;
	    else if(comput[3][toIndex] - comput[3][fromIndex] > 0)
		minImpact[j] = 4;
	}
	
	
	
//	
//	//first solution O(n*m)
//	loop1: for (int i = 0; i < p.length; i++) {
//	    minImpact[i] =  s.charAt(p[i]);
//	    for (int j = p[i]; j <= q[i]; j++) {
//		switch (s.charAt(j)) {
//		case 'A':
//		    minImpact[i] = Math.min(minImpact[i], 1);
//		    continue loop1;
//		case 'C':
//		    minImpact[i] = Math.min(minImpact[i], 2);
//		    break;
//		case 'G':
//		    minImpact[i] = Math.min(minImpact[i], 3);
//		    break;
//		case 'T':
//		    minImpact[i] = Math.min(minImpact[i], 4);
//		    break;
//		default:
//		    continue loop1;
//		}
//	    }
//	}


	return minImpact;
    }

}
