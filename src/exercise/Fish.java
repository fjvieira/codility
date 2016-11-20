package exercise;

import java.util.Stack;

/**
 * @author Fernando José Vieira
 *
 */
public class Fish {

    public static int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < B.length; i++) {

            while (true) {
                if (!stack.empty() && -1 == B[i] - B[stack.peek()]) {
                    if (A[i] > A[stack.peek()]) {
                        stack.pop();
                    } else {
                        break;
                    }
                } else {
                    stack.push(i);
                    break;
                }

            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 4 }, new int[] { 0 }));
        System.out.println(solution(new int[] { 4 }, new int[] { 1 }));
        System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 0, 0, 1, 1 }));
        System.out.println(solution(new int[] { 4, 3, 2, 1, 5 }, new int[] { 0, 1, 0, 0, 0 }));
        System.out.println(solution(new int[] { 4, 3, 2, 6, 5 }, new int[] { 1, 0, 1, 0, 1 }));

    }

}
