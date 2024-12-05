package org.example.vk9laba2.sum.strategy;

public class StrategyDefault implements Strategy{
    @Override
    public double calcSum(double x, double terms, double e) {
        double result = 1.0;
        double up = 1;
        double down = 1;
        double plusMinus = 1;

        for (int n = 1; n <= terms; n += 2) {
            plusMinus *= -1;
            up *= x*x;
            down *= n * (n+1);
            result += plusMinus * up / down;
        }
        return result;
    }
}
