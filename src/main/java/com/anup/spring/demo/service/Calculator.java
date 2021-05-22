package com.anup.spring.demo.service;


import com.anup.spring.demo.command.MathCommand;
import com.anup.spring.demo.factory.MathCommandFactory;
import com.anup.spring.demo.response.CalculateResponse;

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

    public CalculateResponse performCalculation(Double operator1, Double operator2, String operator) {
        MathCommand mathCommand = mathCommandFactory.getMathContext(operator);
        return new CalculateResponse(mathCommand.getName(), mathCommand.calculate(operator1, operator2));
    }

    public List<CalculateResponse> performAllCalculation(Double operator1, Double operator2) {
        return mathCommandFactory
                .getAllMathContext()
                .stream()
                .map(
                        context ->
                                new CalculateResponse(context.getName(), context.calculate(operator1, operator2)
                                )).collect(Collectors.toList());
    }

}
