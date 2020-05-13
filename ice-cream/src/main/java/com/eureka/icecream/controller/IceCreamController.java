package com.eureka.icecream.controller;

import com.eureka.icecream.entity.IceCream;
import com.eureka.icecream.service.IceCreamService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class IceCreamController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment environment;

    @Autowired
    private IceCreamService iceCreamService;


    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public IceCream getIceCreamById(@PathVariable Long id) {
        Object recipe = restTemplate.getForObject("http://recipe-service/1", Object.class);
        System.out.println(recipe);
        return iceCreamService.getIceCreamById(id).get();
    }

    public IceCream fallback(Long id, Throwable hsCommand) {
        return new IceCream();
    }
}
