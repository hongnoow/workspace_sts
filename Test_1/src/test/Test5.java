package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int [] arr = new int[3];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = (int)(Math.random() * 9) + 1;
            for(int j = 0 ; j < i ; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int [] scArr = {num1, num2, num3};

        int strike = 0;
        int ball = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == scArr[i]){
                strike++;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(arr[i] == scArr[j]){
                    ball++;
                }
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        System.out.println("스트라이크 갯수 : " + strike);
        System.out.println("볼 갯수 : " + ball);
//
//        while (true){
//
//        }
    }
}
