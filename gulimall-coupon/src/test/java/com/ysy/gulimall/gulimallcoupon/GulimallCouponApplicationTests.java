package com.ysy.gulimall.gulimallcoupon;

import com.ysy.gulimall.gulimallcoupon.entity.CouponEntity;
import com.ysy.gulimall.gulimallcoupon.service.CouponService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallCouponApplicationTests {

	@Autowired
	CouponService couponService;

	@Test
	public void contextLoads() {
		CouponEntity couponEntity=new CouponEntity();
		couponEntity.setCode("11111");
		couponService.save(couponEntity);
	}

}
