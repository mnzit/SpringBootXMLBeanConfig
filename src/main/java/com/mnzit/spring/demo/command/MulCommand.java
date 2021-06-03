package com.mnzit.spring.demo.command;

import com.mnzit.spring.demo.annotations.Command;
import com.mnzit.spring.demo.enums.MathCommandType;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Command(type = MathCommandType.MUL)
public class MulCommand extends MathCommand {

    @Override
    public Double calculate(Double x, Double y) {
        return x * y;
    }
}
