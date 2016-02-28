package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class FrogJmp {
    
    
    public static void main (String...args) {
	System.out.println(solution(10, 85, 30));
	System.out.println(solution(0, 7, 7));
	System.out.println(solution(6, 7, 7));
	System.out.println(solution(69999, 70000, 50000000));
	System.out.println(solution(7, 7, 0));
    }
    
    public static int solution(int x, int y, int d) {
	return ((new Double(Math.ceil(((double)y - x)/d)))).intValue();
    }
}
