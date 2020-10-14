package com.yjf.springcloudalibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: Controller
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/10/13 17:03
 */
@RestController
public class Controller {


    @GetMapping("/getPort")
    public String getPort() {
        return "8001";
    }


}
