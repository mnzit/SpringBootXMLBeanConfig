package com.anup.spring.demo.context;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class AddContext extends MathContext {

    public AddContext() {
        super("add");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x + y;
    }
}
