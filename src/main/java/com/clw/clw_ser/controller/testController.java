package com.clw.clw_ser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/14.
 */
@RestController
@RequestMapping(value = "/")
public class testController {

    @RequestMapping(value = "/test")
    public String sss(){

        return "suceess";
    }

}
