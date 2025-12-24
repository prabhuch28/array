import java.util.Arrays;

public class removeduplicatesfromarray {

    public int removedup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {11, 2, 2, 4, 5, 6, 6, 77, 77, 90};

        Arrays.sort(nums);

        removeduplicatesfromarray remover = new removeduplicatesfromarray();

        int newLength = remover.removedup(nums);

        System.out.println("Array after sorting: " + Arrays.toString(nums));
        System.out.print("Array with duplicates removed: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}