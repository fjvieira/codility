package exercise;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {}));
        System.out.println(solution(new int[] { 1 }));
        System.out.println(solution(new int[] { 3, 4, 3, 2, 3, -1, 3, 3 }));
        System.out.println(solution(new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1 }));
        System.out.println(solution(new int[] { 0, 0, 0, 0, 1, 1, 1, 1 }));
        System.out.println(solution(new int[] { 0, 0, 0, 0, 2, 1, 1, 1, 1 }));
    }

    public static int solution(int[] a) {
        int edge = a.length / 2;

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int freqNumber = frequency.containsKey(a[i]) ? frequency.get(a[i]) + 1 : 1;
            if (frequency.containsKey(a[i]) && freqNumber > edge)
                return i;
            else
                frequency.put(a[i], freqNumber);
        }

        return a.length == 1 ? 0 : -1;
    }
}
