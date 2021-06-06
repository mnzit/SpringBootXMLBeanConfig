package com.mnzit.spring.demo.request;

import com.mnzit.spring.demo.enums.MathCommandType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculateRequest implements Serializable {
    private Double operator1;
    private Double operator2;
    private MathCommandType operator;
}
