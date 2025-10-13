import java.util.Arrays;

public class secondlargestelement {

    static int getSecondlargest(int[]arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =n-1;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;

    }
    public static void main(String[] args) {
 int [] arr={12,35,50,80,7};
        System.out.println(getSecondlargest(arr));
    }
}
