package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class PassingCars {

    public static void main(String... args) {
        System.out.println(solution(new int[] { 0 }));
        System.out.println(solution(new int[] { 0, 1 }));
        System.out.println(solution(new int[] { 1, 0 }));
        System.out.println(solution(new int[] { 0, 0, 0, 0, 0, 0 }));
        System.out.println(solution(new int[] { 1, 1, 1, 1, 1, 1 }));
        System.out.println(solution(new int[] { 1, 1, 1, 1, 0 }));
        System.out.println(solution(new int[] { 0, 1, 0, 1, 1 }));
    }

    public static int solution(int[] a) {
        int multiplier = 0;
        int tuple = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                multiplier++;
            } else {
                tuple += multiplier;
            }
            if (tuple > 1000000000) {
                return -1;
            }
        }

        return tuple;

    }
}
