package com.yjf.springcloudalibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: Controller
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/10/14 18:16
 */
@RestController
public class Controller {

    @GetMapping("/getMapping")
    public String getInfo(){
        return "getInfo";
    }

}
