public class LinearSer {


    public static void main(String[] args) {
        int[] nums = {5, 8, 9, 4, 9};
        int target = 8;
        int result = linearSearch(nums, target);
             if(result != -1)
                 System.out.println("element founs at index "+ result);
             else System.out.println("element not found");

        System.out.println("elemnt found at Index:" + result);


    }


    public static int linearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;

        }
        return -1;


    }
}



