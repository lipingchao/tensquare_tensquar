package com.exampl.demo.controller;

import com.exampl.demo.pojo.Label;
import com.exampl.demo.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @User lpc/李金超
 * @ClassName LabelController  类名
 * @Author AUSUA  作者
 * @Date 2020/5/8 12:17  时间
 * @Version 1.0 版本
 */
@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 根据Id查询单个数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable String id){
        Label byId = labelService.findById(id);
        return new Result(true,StatusCode.OK,byId);
    }

    /**
     * 增加方法
     * @param label
     * @return
     */
    @PostMapping
    public Result save(@RequestBody Label label){
        label.setId(UUID.randomUUID().toString().replaceAll("-",""));
        labelService.save(label);
        return new Result(true,StatusCode.OK,"添加成功！");
    }

    /**
     * 查询全部
     * @return
     */
    @GetMapping
    public Result findAll(){
        List<Label> labels =  labelService.findAll();
        return new Result(true, StatusCode.OK,labels);
    }

    /**
     * 根据Id进行删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id")String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功！");
    }

    /**
     * 根据Id进行修改
     * @param label
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public Result update(@RequestBody Label label,@PathVariable("id")String id){
        label.setId(id);
        Label label1 = labelService.update(label);
        return new Result(true,StatusCode.OK,label);
    }


}
