package com.chrouki.hellowordspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tarik Chrouki on 19/12/17.
 */
@RestController
public class helloController {

    @RequestMapping("/")
    public String index() {
        return "Hello world!";
    }
}
