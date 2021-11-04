public class Solution {
    //very inefficient haha only faster than 5%
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
