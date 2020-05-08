package com.exampl.demo;

import com.exampl.demo.jpa.LabelDao;
import com.exampl.demo.pojo.Label;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

	@Autowired
	LabelDao labelDao;
	
	@Test
	public void contextLoads() {
		
		List<Label> findAll = labelDao.findAll();
		for (Label label : findAll) {
			System.out.println(label.getLabelname());
		}
		
	}

}