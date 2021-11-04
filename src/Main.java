import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] array1 = {2,7,11,15};
        int[] array2 = {2,3,4};
        int[] array3 = {-1,0};

        System.out.println(Arrays.toString(solution.twoSum(array1, 9)));
        System.out.println(Arrays.toString(solution.twoSum(array2, 6)));
        System.out.println(Arrays.toString(solution.twoSum(array3, -1)));
    }
}
