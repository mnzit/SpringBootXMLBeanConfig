package com.mnzit.spring.demo.service;

import com.mnzit.spring.demo.models.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class StudentService {

    private Map<Long, Student> studentMap;

    public Student findStudentById(Long id) {
        return studentMap.get(id);
    }

    @Autowired
    public void setStudentMap(Map<Long, Student> studentMap) {
        this.studentMap = studentMap;
    }
}
