package com.anup.spring.demo.command;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class DivCommand extends MathCommand {

    public DivCommand() {
        super("div");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x / y;
    }
}
