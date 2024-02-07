package test;

public class Calculate {
    int num1 = 10;
    int num2 = 20;

    void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int getSum() {
        return num1 + num2;
    }

    int getMax(){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }

    double getAvg(){
        int sum = 0;
        double avg = 0.0;
        if(num1 > num2){
            for(int i = 1; i < num1 - num2; i++){
                sum += num2 + i;
            }
            avg = (double)sum / (num1 - num2 + 1);
        }
        if(num2 > num1){
            for(int i = 1; i < num2 - num1; i++){
                sum += num1 + i;
            }
            avg = (double) sum / (num2 - num1 - 1);
        }
        return avg;
    }
}
