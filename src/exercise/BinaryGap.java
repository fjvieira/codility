package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(529));
        System.out.println(solution(1162));
        System.out.println(solution(66561));

    }

    public static int solution(int number) {
        char[] binaryRepr = Integer.toBinaryString(number).toCharArray();
        System.out.println(binaryRepr);

        char ONE = '1';

        int maxGap = 0;
        int currentGap = 0;
        boolean startedSequence = false;

        for (int i = 0; i < binaryRepr.length; i++) {
            if (binaryRepr[i] == ONE) {
                if (currentGap > maxGap) {
                    maxGap = currentGap;
                }
                currentGap = 0;
            } else {
                currentGap++;
            }
        }

        return maxGap;
    }

}
