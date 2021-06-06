package com.mnzit.spring.demo.command;

import com.mnzit.spring.demo.annotations.Command;
import com.mnzit.spring.demo.enums.MathCommandType;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Command(type = MathCommandType.POW)
public class PowerCommand extends MathCommand {

    @Override
    public Double calculate(Double x, Double y) {
        return Math.pow(x, y);
    }
}
