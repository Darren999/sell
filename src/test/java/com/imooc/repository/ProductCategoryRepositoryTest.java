package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        log.info(productCategory.toString());

    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }
}