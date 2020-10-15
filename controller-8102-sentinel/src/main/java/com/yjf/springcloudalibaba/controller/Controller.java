package com.yjf.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: Controller
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/10/14 18:16
 */
@RestController
@RequestMapping("/get")
public class Controller {

    @GetMapping("/getMapping")
    @SentinelResource("getMapping")
    public String getInfo(){
        return "getInfo";
    }

}
