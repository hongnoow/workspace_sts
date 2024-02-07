package test;

public class Test3 {
    public static void main(String[] args) {
        int arr [] = {5 , 11, 20, 40, 30};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("큰 값 : " + max);
        System.out.println("작은 값 : " + min);

    }
}
