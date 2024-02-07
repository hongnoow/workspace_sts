package test;

public class CalTest {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        calculate.setNumber(3, 10);

        System.out.println(calculate.num1);

        System.out.println(calculate.num2);

        System.out.println(calculate.getSum());

        System.out.println(calculate.getMax());

        System.out.println(calculate.getAvg());


    }
}

