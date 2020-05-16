package com.exampl.demo.controller;

import com.exampl.demo.pojo.City;
import entity.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @User lpc/李金超
 * @ClassName CityController  类名
 * @Author AUSUA  作者
 * @Date 2020/5/16 8:47  时间
 * @Version 1.0 版本
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @PostMapping
    public Result save(@RequestBody City city){

        return null;
    }

}
