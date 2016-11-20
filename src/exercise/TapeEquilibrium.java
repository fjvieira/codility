package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
        System.out.println(solution(new int[] { 3, 1, 2, 4, 3 }));
    }

    public static int solution(int[] a) {
        // write your code in Java SE 8
        int length = a.length;
        int leftSum[] = new int[length];

        leftSum[length - 1] = a[length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            leftSum[i] = a[i] + leftSum[i + 1];
        }
        int minDif = 100000;
        int rightsum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            rightsum += a[i];
            int dif = Math.abs(rightsum - leftSum[i + 1]);
            if (dif < minDif) {
                minDif = dif;
            }
        }

        return minDif;
    }
}
