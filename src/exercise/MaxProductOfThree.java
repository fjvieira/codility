package exercise;

import java.util.Arrays;

/**
 * @author Fernando Jose Vieira
 *
 */
public class MaxProductOfThree {

    public static void main(String... args) {
        System.out.println(solution(new int[] {}));
        System.out.println(solution(new int[] { 1 }));
        System.out.println(solution(new int[] { 1, 2 }));
        System.out.println(solution(new int[] { 2, 2, 3 }));
        System.out.println(solution(new int[] { 2, 2, 2 }));
        System.out.println(solution(new int[] { 10, 2, 5, 1, 8, 20 }));
        System.out.println(solution(new int[] { 20, 2, 5, 1, 8, 20 }));
        System.out.println(solution(new int[] { 10, 50, 5, 1 }));

    }

    public static int solution(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        Arrays.sort(a);
        int last = a.length - 1;

        int result1 = a[0] * a[1] * a[last];
        int result2 = a[last - 2] * a[last - 1] * a[last];

        return result1 > result2 ? result1 : result2;
    }
}
