public class CheckifArrayContainsaSpecificElement {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,8};
        int target=3;
        boolean contains = false;
        for( int num : arr){
            if(num== target){
                contains =true;
                break;

            }
        }
        if(contains){
            System.out.println(target);
        } else{
            System.out.println("array does not "+ target);

        }
    }
}
