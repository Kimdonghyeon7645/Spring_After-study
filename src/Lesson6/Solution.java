package Lesson6;

import java.util.TreeSet;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {

        TreeSet<Integer> answer = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(new int[] {2, 1, 3, 4, 1});
    }
}
