package com.mnzit.spring.demo.command;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public abstract class MathCommand {

    private final String name;

    public MathCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Double calculate(Double x, Double y);
}
