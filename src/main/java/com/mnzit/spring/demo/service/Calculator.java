package com.mnzit.spring.demo.service;

import com.mnzit.spring.demo.annotations.Command;
import com.mnzit.spring.demo.command.MathCommand;
import com.mnzit.spring.demo.enums.MathCommandType;
import com.mnzit.spring.demo.factory.MathCommandFactory;
import com.mnzit.spring.demo.response.CalculateResponse;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class Calculator {

    private final MathCommandFactory mathCommandFactory;

    public Calculator(MathCommandFactory mathCommandFactory) {
        this.mathCommandFactory = mathCommandFactory;
    }

    public CalculateResponse calculate(Double operator1, Double operator2, MathCommandType operator) {
        final MathCommand mathCommand = mathCommandFactory.getMathContext(operator);
        return new CalculateResponse(operator.name(), mathCommand.calculate(operator1, operator2));
    }

    public List<CalculateResponse> calculateAll(Double operator1, Double operator2) {
        return mathCommandFactory
                .getAllMathContext()
                .stream()
                .map(context -> new CalculateResponse(
                context
                        .getClass()
                        .getAnnotation(Command.class)
                        .type()
                        .name(),
                context.calculate(operator1, operator2)))
                .collect(Collectors.toList());
    }

}
