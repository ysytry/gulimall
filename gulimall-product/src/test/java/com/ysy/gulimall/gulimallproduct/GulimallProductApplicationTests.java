package com.ysy.gulimall.gulimallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ysy.gulimall.gulimallproduct.entity.BrandEntity;
import com.ysy.gulimall.gulimallproduct.service.BrandService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    public void contextLoads() {
        /*
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("阿里");
        brandService.save(brandEntity);

         */
        List<BrandEntity> list=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });


    }


}
