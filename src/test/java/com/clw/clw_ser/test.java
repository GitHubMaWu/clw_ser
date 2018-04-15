package com.clw.clw_ser;

import com.clw.clw_ser.mapper.categoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClwServApplication.class)
public class test {
    @Autowired
    private categoryMapper categoryMapper;

    @Test
    public void testInsert(){
        System.out.println(categoryMapper.selectByPrimaryKey("1").getName());
    }

}
