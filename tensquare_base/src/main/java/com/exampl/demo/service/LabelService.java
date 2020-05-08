package com.exampl.demo.service;

import com.exampl.demo.jpa.LabelDao;
import com.exampl.demo.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @User lpc/李金超
 * @ClassName LabelService  类名
 * @Author AUSUA  作者
 * @Date 2020/5/8 12:19  时间
 * @Version 1.0 版本
 */
@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    public Label findById(String id) {
        return labelDao.getById(id);
    }

    public List<Label> findAll() {
        return labelDao.findAll();
    }

    public void save(Label label) {
        labelDao.save(label);
    }

    public void deleteById(String id) {
        labelDao.deleteById(id);
    }

    public Label update(Label label) {
        return labelDao.save(label);
    }
}
