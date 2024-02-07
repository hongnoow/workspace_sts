package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hun = 0;
        int ten = 0;
        int one = 0;

        //일의 자리
        if((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9 ){
            one++;
        }

        //두 자릿 수일때 십의 자리
        if((num / 10) == 3 || (num / 10) == 6 || (num / 10) == 9){
            ten++;
        }

        //세 자릿 수일 때 십의 자리
        if((num / 10) == 13 || (num / 10) == 16 || (num / 10) == 19 ||
                (num / 10) == 23 || (num / 10) == 26 || (num / 10) == 29 ||
                (num / 10) == 33 || (num / 10) == 36 || (num / 10) == 39 ||
                (num / 10) == 43 || (num / 10) == 46 || (num / 10) == 49 ||
                (num / 10) == 53 || (num / 10) == 56 || (num / 10) == 59 ||
                (num / 10) == 63 || (num / 10) == 66 || (num / 10) == 69 ||
                (num / 10) == 73 || (num / 10) == 76 || (num / 10) == 79 ||
                (num / 10) == 83 || (num / 10) == 86 || (num / 10) == 89 ||
                (num / 10) == 93 || (num / 10) == 96 || (num / 10) == 99){
            ten ++;
        }

        //백의 자리
        if((num / 100) == 3 || (num / 100) == 6 || (num / 100) == 9){
            hun++;
        }
        int cnt = one + ten + hun;

        if(cnt == 0){
            System.out.println("박수 0번");
        }
        if(cnt == 1){
            System.out.println("박수 한 번");
        }
        if(cnt == 2){
            System.out.println("박수 두 번");
        }
        if(cnt == 3){
            System.out.println("박수 세 번");
        }

    }
}
