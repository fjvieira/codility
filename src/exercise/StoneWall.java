package exercise;

import java.util.Stack;

/**
 * @author Fernando
 *
 */
public class StoneWall {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 8 }));
        System.out.println(solution(new int[] { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }));
        System.out.println(solution(new int[] { 2, 1, 1, 1, 2, 1, 1, 2, 1, 2 }));
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 }));
        System.out.println(solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }));
    }

    public static int solution(int[] h) {
        int numberOfBlocks = 1;

        Stack<Integer> stack = new Stack<>();

        // first block
        stack.push(h[0]);

        heightLoop: for (int i = 1; i < h.length; i++) {
            while (!stack.empty() && h[i] <= stack.peek()) {
                if (stack.peek() == h[i]) {
                    continue heightLoop;
                } else {
                    stack.pop();
                }
            }
            stack.push(h[i]);
            numberOfBlocks++;
        }

        return numberOfBlocks;
    }
}
