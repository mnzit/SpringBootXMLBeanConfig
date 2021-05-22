package com.anup.spring.demo.service;


import com.anup.spring.demo.context.MathContext;
import com.anup.spring.demo.factory.MathContextFactory;
import com.anup.spring.demo.response.CalculateResponse;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class Calculator {

    private final MathContextFactory mathContextFactory;

    public Calculator(MathContextFactory mathContextFactory) {
        this.mathContextFactory = mathContextFactory;
    }

    public CalculateResponse performCalculation(Double operator1, Double operator2, String operator) {
        MathContext mathContext = mathContextFactory.getMathContext(operator);
        return new CalculateResponse(mathContext.getName(), mathContext.calculate(operator1, operator2));
    }

    public List<CalculateResponse> performAllCalculation(Double operator1, Double operator2) {
        return mathContextFactory
                .getAllMathContext()
                .stream()
                .map(
                        context ->
                                new CalculateResponse(context.getName(), context.calculate(operator1, operator2)
                                )).collect(Collectors.toList());
    }

}
