package exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Fernando Jose Vieira
 *
 */
public class Distinct {
    //
    public static void main(String... args) {
        System.out.println(solution(new int[] {}));
        System.out.println(solution(new int[] { 1 }));
        System.out.println(solution(new int[] { 12, 4, 6, -34 }));
    }

    public static int solution(int[] a) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        return set.size();
    }
}
