package com.su.yoga;

import com.su.yoga.bean.Result;
import com.su.yoga.bean.User;
import com.su.yoga.service.UserService;
import com.sun.org.apache.xpath.internal.objects.XObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
public class YogaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YogaApplication.class, args);
    }
//      demo
//    @RequestMapping("/index")
//    public Object index(){
//        return "hello world";
//    }

}
