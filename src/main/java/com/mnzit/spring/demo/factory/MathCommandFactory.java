package com.mnzit.spring.demo.factory;

import com.mnzit.spring.demo.annotations.Command;
import com.mnzit.spring.demo.command.MathCommand;
import com.mnzit.spring.demo.enums.MathCommandType;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MathCommandFactory {

    private final List<MathCommand> mathCommands;
    private final Map<MathCommandType, MathCommand> operators;

    public MathCommandFactory(List<MathCommand> mathCommands) {
        this.mathCommands = mathCommands;
        operators = mathCommands
                .stream()
                .collect(
                        Collectors.toMap(
                                command -> command
                                        .getClass()
                                        .getAnnotation(Command.class)
                                        .type(),
                                Function.identity()
                        )
                );
    }

    public MathCommand getMathContext(MathCommandType mode) {
        return operators.get(mode);
    }

    public List<MathCommand> getAllMathContext() {
        return mathCommands;
    }
}
