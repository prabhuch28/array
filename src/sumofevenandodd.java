public class sumofevenandodd {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9};
        int evensum=0;
        int oddsum=0;
        for(int number : numbers){
            if(number % 2 ==0){
                evensum += number;

            } else {
                oddsum+=number;
            }
        }
        System.out.println("sum of even numbers:"+evensum);
        System.out.println("sum of odd numbers are:"+oddsum);
    }
}
