package com.yjf.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Title: Controller
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/10/13 17:04
 */
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPort")
    public String getPort(){
        return restTemplate.getForObject("http://controller/getPort",String.class);
    }

}
