package Lesson6;

import java.util.TreeSet;

class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> answer = new TreeSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(new int[] {2, 1, 3, 4, 1}));
    }
}
