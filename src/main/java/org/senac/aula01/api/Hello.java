package org.senac.aula01.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class Hello {

    @GetMapping
    public String get() {
        return "hello";
    }
}
