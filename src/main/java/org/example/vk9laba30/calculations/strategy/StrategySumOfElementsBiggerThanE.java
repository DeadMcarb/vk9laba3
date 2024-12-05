package org.example.vk9laba2.sum.strategy;

public class StrategySumOfElementsBiggerThanE implements Strategy{
    @Override
    public double calcSum(double x, double terms, double e) {
        double result = 1.0;
        double up = 1;
        double down = 1;
        double plusMinus = 1;

        double curentTerm;
        for (int n = 1; n <= terms; n += 2) {
            plusMinus *= -1;
            up *= x*x;
            down *= n * (n+1);

            curentTerm = plusMinus * up / down;

            result += curentTerm;
            if (curentTerm < e)break;

        }
        return result;
    }
}
