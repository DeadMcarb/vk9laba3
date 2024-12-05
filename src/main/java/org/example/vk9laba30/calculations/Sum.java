package org.example.vk9laba2.sum;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.vk9laba2.sum.strategy.Strategy;
import org.example.vk9laba2.sum.strategy.StrategyDefault;

@AllArgsConstructor
@Getter
@Setter
public class Sum {
    private Strategy strategy ;

    public Sum() {
        this.strategy = new StrategyDefault();
    }

    double executeStrategy(double a, double b, double c) {
        return strategy.calcSum(a, b, c);
    }


}
