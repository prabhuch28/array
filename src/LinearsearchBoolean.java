public class LinearsearchBoolean {
    static boolean linearSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return false;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89};
        int key = 67;
        System.out.println(linearSearch(arr, key));
    }
}




