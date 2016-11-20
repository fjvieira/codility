package exercise;

/**
 * @author Fernando
 *
 */
public class EquiLeader {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 4, 3, 4, 4, 4, 2 }));
        System.out.println(solution(new int[] { 2, 4, 4, 4, 3, 4 }));
    }

    public static int solution(int[] A) {

        int size = 0;
        int value = 0;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            } else {
                if (A[i] == value)
                    size++;
                else
                    size--;
            }
        }

        int count = 0;

        for (int j = 0; j < A.length; j++) {
            if (A[j] == value) {
                count++;
            }
        }

        if (count <= (A.length / 2)) {
            return 0;
        } else {
            int occurences = 0;
            size = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == value) {
                    count--;
                    size++;
                }
                if ((size > ((i + 1) / 2)) && (count > (A.length - (i + 1)) / 2)) {
                    occurences++;
                }
            }
            return occurences;
        }
    }
}
