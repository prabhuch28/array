public class SumofElementsinanarray {
    public static void main(String[] args) {
        int[] number = {1, 2, 30, 4, 5};
        int sum = 0;
        for (int num : number) {

            sum += num;

        }
        System.out.println("sum of element:"+sum);
    }
}