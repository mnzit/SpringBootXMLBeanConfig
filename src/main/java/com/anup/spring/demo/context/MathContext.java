package com.anup.spring.demo.context;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public abstract class MathContext {

    private final String name;

    public MathContext(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Double calculate(Double x, Double y);
}
