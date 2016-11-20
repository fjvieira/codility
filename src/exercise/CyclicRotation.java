package exercise;

/**
 * @author Fernando Jose Vieira
 *
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        printArray(array);
        printArray(solution(array, 0));
        printArray(solution(array, 3));
        printArray(solution(array, 2));
        printArray(solution(array, 8));
        array = new int[] {};
        printArray(array);
        printArray(solution(array, 8));

    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1] + "];");
    }

    public static int[] solution(int[] a, int k) {
        int arrayLength = a.length;
        int[] newArray = new int[arrayLength];

        if (arrayLength > 0) {

            if (k > arrayLength) {
                k = k % arrayLength;
            }

            for (int i = 0; i < a.length; i++) {
                int position = (i + k) % arrayLength;
                newArray[position] = a[i];
            }
        }
        return newArray;
    }
}
