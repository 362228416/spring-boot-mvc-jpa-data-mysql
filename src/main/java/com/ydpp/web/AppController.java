package com.ydpp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: john
 * @version: 1.0 2015-02-17 下午10:42
 */
@RestController
public class AppController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name + "~";
    }

    @RequestMapping("/info")
    public Map<String, String> info() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("spring version", "4.0.3");
        map.put("spring data jpa version", "1.5.2");
        return map;
    }

    @RequestMapping("/")
    public String index() {
        return "this is a spring boot application..";
    }

}
