package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findById() {
        log.info("findById");
        ProductCategory productCategory = categoryService.findById(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        log.info("findAll");
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        log.info("findByCategoryTypeIn");
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() {
        log.info("save");
        ProductCategory productCategory = new ProductCategory("男生专享",3);
        categoryService.save(productCategory);
    }
}