package org.example.vk9laba333.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.example.vk9laba333.calculations.Tabulation;
import org.example.vk9laba333.model.Result;


@Named
@RequestScoped
@Getter
@Setter
public class TabulationBean {

    public TabulationBean() {
        a = 0.5;
        b = 2;
        h = 0.01;
    }

    private double a;
    private double b;
    private double h;

    private Result result;

    public String calculate() {
        System.out.println("Here's tabulation calc invoked");
        Tabulation calcFunction = new Tabulation();
        calcFunction.calculate(a, b, h);

        result = new Result(0, 0, 0, 0, calcFunction.getXArr(), calcFunction.getYArr());
        System.out.println(result);
        return "tabulation";
    }
}

