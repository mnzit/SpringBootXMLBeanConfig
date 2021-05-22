package com.mnzit.spring.demo.command;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class AddCommand extends MathCommand {

    public AddCommand() {
        super("add");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x + y;
    }
}
