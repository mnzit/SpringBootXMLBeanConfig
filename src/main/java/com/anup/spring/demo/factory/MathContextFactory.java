package com.anup.spring.demo.factory;

import com.anup.spring.demo.context.MathContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class MathContextFactory {

    private final List<MathContext> mathContexts;
    private final Map<String, MathContext> operators = new HashMap<>();

    public MathContextFactory(List<MathContext> mathContexts) {
        this.mathContexts = mathContexts;
        initializeMathContextMap(mathContexts);
    }

    public MathContext getMathContext(String mode) {
        return operators.get(mode);
    }

    public List<MathContext> getAllMathContext() {
        return mathContexts;
    }

    private void initializeMathContextMap(List<MathContext> mathContexts) {
        for (MathContext mathContext : mathContexts) {
            operators.put(mathContext.getName(), mathContext);
        }
    }

}
