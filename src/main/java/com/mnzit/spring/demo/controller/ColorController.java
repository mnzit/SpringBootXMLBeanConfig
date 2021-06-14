package com.mnzit.spring.demo.controller;

import com.mnzit.spring.demo.service.ColorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Slf4j
@RestController
@RequestMapping("color")
public class ColorController {

    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/{colorPrefix}")
    public List<String> findColorByPrefix(@PathVariable String colorPrefix) {
        return colorService.getColorStartingWith(colorPrefix);
    }
}
