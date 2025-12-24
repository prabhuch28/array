import static java.util.Arrays.binarySearch;

public class demobinearsearch  {


    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int target =5;
        int result = binarySearch(nums, target);
        if (result != -1)
            System.out.println("element founs at index " + result);
        else System.out.println("element not found");

        System.out.println("elemnt found at Index:" + result);


    }


    public static int learnerSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;

        }
        return -1;


    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid; // found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // not found
    }


        }







