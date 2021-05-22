package com.mnzit.spring.demo.controller;

import com.mnzit.spring.demo.request.CalculateRequest;
import com.mnzit.spring.demo.response.CalculateResponse;
import com.mnzit.spring.demo.service.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Slf4j
@RestController
@RequestMapping("calculator")
public class TestController {

    private final Calculator calculator;

    public TestController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public CalculateResponse calculate(@RequestParam("operator1") Double operator1,
                                       @RequestParam("operator2") Double operator2,
                                       @RequestParam("operator") String operator
    ) {

        return calculator.performCalculation(operator1, operator2, operator);
    }

    @GetMapping("json-body")
    public CalculateResponse calculateWithJsonRequest(@RequestBody CalculateRequest request) {
        return calculator.performCalculation(request.getOperator1(), request.getOperator2(), request.getOperator());
    }

    @GetMapping("json-body/{ops}")
    public CalculateResponse calculateWithJsonRequestAndPathVariable(@RequestBody CalculateRequest request,
                                                                     @PathVariable("ops") String operator) {
        return calculator.performCalculation(request.getOperator1(), request.getOperator2(), operator);
    }

    @GetMapping("calculate/all")
    public List<CalculateResponse> performAllCalculation(@RequestBody CalculateRequest request) {
        return calculator.performAllCalculation(request.getOperator1(), request.getOperator2());
    }


}
