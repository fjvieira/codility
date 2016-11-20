package exercise;

public class EquiDemo {

    public static int solution(int[] A) {

        if (A.length > 2) {
            int rsum = 0;
            int lsum = 0;
            int oldPosValue = 0;
            for (int i = A.length - 1; i >= 0; i--) {
                rsum += A[i];
            }

            for (int i = 0; i < A.length; i++) {
                rsum -= A[i];
                lsum += oldPosValue;
                if (rsum == lsum)
                    return i;
                oldPosValue = A[i];
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {}));
        System.out.println(solution(new int[] { 1, -1 }));
        System.out.println(solution(new int[] { 1, 1, -1, -1 }));
        System.out.println(solution(new int[] { 1, -1, 500, 1, -1 }));
        System.out.println(solution(new int[] { -1, 3, -4, 5, 1, -6, 2, 1 }));

    }

}
