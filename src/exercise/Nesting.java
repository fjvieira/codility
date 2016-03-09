package exercise;

public class Nesting {

    public static void main(String...args) {
	System.out.println(solution(""));	
	System.out.println(solution("()"));
	System.out.println(solution("(()())"));
	System.out.println(solution("))"));
    }
 
    /**
     * @param s
     * @return
     */
    public static int solution(String s){
	long nested = 0;
	for (int i = 0; i < s.length(); i++) {
	    if(s.charAt(i) == '(') {
		nested++;
	    } else if(s.charAt(i) == ')') {
		nested--;
	    } else {
		nested = -1;
	    }

	    if(nested < 0){
		return 0;
	    }
	}

	if(nested != 0){
	    return 0;
	} else {
	    return 1;
	}

    }
}
