package com.anup.spring.demo.command;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class SubCommand extends MathCommand {

    public SubCommand() {
        super("sub");
    }

    @Override
    public Double calculate(Double x, Double y) {
        return x - y;
    }
}
