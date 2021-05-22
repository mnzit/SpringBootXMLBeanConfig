package com.mnzit.spring.demo.factory;

import com.mnzit.spring.demo.command.MathCommand;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MathCommandFactory {

    private final List<MathCommand> mathCommands;
    private final Map<String, MathCommand> operators;

    public MathCommandFactory(List<MathCommand> mathCommands) {
        this.mathCommands = mathCommands;
        operators = mathCommands.stream().collect(Collectors.toMap(MathCommand::getName, Function.identity()));
    }

    public MathCommand getMathContext(String mode) {
        return operators.get(mode);
    }

    public List<MathCommand> getAllMathContext() {
        return mathCommands;
    }
}
