package com.mnzit.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ColorService {

    private List<String> colors;

    public List<String> getColorStartingWith(String startsWith) {
        return colors
                .stream()
                .filter(colors -> colors.toLowerCase().startsWith(startsWith.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Autowired
    public void setColors(List<String> colors) {
        this.colors = colors;
    }
}
