package com.zp;

import com.zp.dubbo.IUserInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zp
 * @create 2020/8/29 12:32
 */
@RestController
public class IndexController {
    @Reference
    IUserInterface iUserInterface;

    @GetMapping("/hello")
    public String hello(String name) {
        return iUserInterface.sayHello(name);
    }
}
