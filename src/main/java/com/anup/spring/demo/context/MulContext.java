package com.anup.spring.demo.context;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MulContext extends MathContext {

    public MulContext() {
        super("mul");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x * y;
    }
}
