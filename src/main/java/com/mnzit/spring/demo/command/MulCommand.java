package com.mnzit.spring.demo.command;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MulCommand extends MathCommand {

    public MulCommand() {
        super("mul");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x * y;
    }
}
