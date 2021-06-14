package com.mnzit.spring.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable {

    private Long id;
    private String name;
    private String address;
    private String contactNo;
}
