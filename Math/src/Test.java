public class Test {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            sum += i;
        }
        System.out.println("총합 : " + sum);


        int sum1 = 0;
        int[] arr = {9, 12, 8, 7, 10};
        for(int i = 0 ; i < arr.length ; i++){
            sum1 += arr[i];
        }
        System.out.println("배열 총합 : " + sum1);
    }
}

