public class MathUtilImpl implements MathUtil{
    @Override
    public boolean isEven(int a, int b, int c) {

        if((a + b + c) % 2 == 0 && (a + b + c) % 5 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double getSumFromOne(int num) {
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            sum += i;
        }
        return sum;
    }

    @Override
    public int getArraySum(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }
}
