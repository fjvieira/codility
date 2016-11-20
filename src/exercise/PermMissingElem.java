package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int[] array = new int[] { 2, 3, 1, 5 };
        printArray(array);
        System.out.println(solution(array));
        array = new int[] { 1 };
        printArray(array);
        System.out.println(solution(array));
        array = new int[] { 3, 2, 5, 4 };
        printArray(array);
        System.out.println(solution(array));
        array = new int[] { 3, 2, 1, 4 };
        printArray(array);
        System.out.println(solution(array));
        array = new int[] {};
        System.out.println("[]");
        System.out.println(solution(array));
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1] + "];");
    }

    public static int solution(int[] a) {
        int expSum = a.length + 1;
        int curSum = 0;
        for (int i = 0; i < a.length; i++) {
            expSum += i + 1;
            curSum += a[i];
        }
        return expSum - curSum;
    }
}
