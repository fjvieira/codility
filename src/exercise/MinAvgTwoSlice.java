package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class MinAvgTwoSlice {

    public static void main(String... args) {
        System.out.println(solution(new int[] { 12, 4 }));
        System.out.println(solution(new int[] { 12, 4, 6, -34 }));
        System.out.println(solution(new int[] { 4, 2, 2, 5, 1, 5, 8 }));
        System.out.println(solution(new int[] { 5, 2, -2, 5 }));
    }

    public static int solution(int[] a) {
        int pos = 0;
        double min = (double) (a[0] + a[1]) / 2;

        for (int i = 0; i < a.length; i++) {

            if (i + 1 < a.length) {
                double media = (double) (a[i] + a[i + 1]) / 2.0;
                if (media < min) {
                    min = media;
                    pos = i;
                    continue;
                }
            }
            if (i + 2 < a.length) {
                double media = (double) (a[i] + a[i + 1] + a[i + 2]) / 3.0;
                if (media < min) {
                    min = media;
                    pos = i;
                }
            }
        }

        return pos;

        // old
        // for (int i = 0; i < a.length; i++) {
        // int intervalSum = a[i];
        // for (int j = i + 1; j < a.length; j++) {
        // intervalSum += a[j];
        // double media = (double) intervalSum / (j - i + 1);
        // if (media < min) {
        // min = media;
        // pos = i;
        // }
        // }
        // }
        //
        // return pos;
    }
}
