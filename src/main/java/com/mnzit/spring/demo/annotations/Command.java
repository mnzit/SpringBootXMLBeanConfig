package com.mnzit.spring.demo.annotations;

import com.mnzit.spring.demo.enums.MathCommandType;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface Command {

    MathCommandType type();

}
