package com.anup.spring.demo.response;

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
public class CalculateResponse implements Serializable {
    private String operation;
    private Double result;
}

