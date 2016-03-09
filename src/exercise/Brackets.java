package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class Brackets {

    
    public static void main(String...args) {
	System.out.println(solution("[]{}"));
	System.out.println(solution("{[()()]}"));
	System.out.println(solution("([)()]"));
	System.out.println(solution("([[()()()()[][][][][][]]])"));
	System.out.println(solution("([[]]]]]]]]]]]]]]]]]]])"));
	System.out.println(solution("]]]]]]]]]]]]]]]]]]])"));
	
    }
    
    public static int solution(String s){
	char[] stack = new char[s.length()];
	int currentPosition = -1;

	for (int i = 0; i < s.length(); i++) {
	    char currentChar = s.charAt(i);
	    if ('(' == currentChar || '{' == currentChar || '[' == currentChar) {
		currentPosition++;
		stack[currentPosition] = currentChar;
	    } else {
		char matchChar;
		switch (currentChar) {
		case ')':
		    matchChar = '(';
		    break;		    
		case '}':
		    matchChar = '{';
		    break;
		case ']':
		    matchChar = '[';
		    break;
		default:
		    return 0;
		}
		if(currentPosition > -1 && matchChar == stack[currentPosition]) {
		    currentPosition--;
		} else {
		    return 0;
		}
	    }
	}
	
	if(currentPosition != -1){
	    return 0;
	}
	
	
	return 1;
    }
}
