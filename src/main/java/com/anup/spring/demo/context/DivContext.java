package com.anup.spring.demo.context;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class DivContext extends MathContext {

    public DivContext() {
        super("div");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x / y;
    }
}
