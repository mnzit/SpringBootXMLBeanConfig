package com.mnzit.spring.demo.factory;

import com.mnzit.spring.demo.command.MathCommand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MathCommandFactory {

    private final List<MathCommand> mathCommands;
    private final Map<String, MathCommand> operators = new HashMap<>();

    public MathCommandFactory(List<MathCommand> mathCommands) {
        this.mathCommands = mathCommands;
        initializeMathContextMap(mathCommands);
    }

    public MathCommand getMathContext(String mode) {
        return operators.get(mode);
    }

    public List<MathCommand> getAllMathContext() {
        return mathCommands;
    }

    private void initializeMathContextMap(List<MathCommand> mathCommands) {
        for (MathCommand mathCommand : mathCommands) {
            operators.put(mathCommand.getName(), mathCommand);
        }
    }

}
