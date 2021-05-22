package com.anup.spring.demo.context;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class SubContext extends MathContext {

    public SubContext() {
        super("sub");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x - y;
    }
}
