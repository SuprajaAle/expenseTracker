package com.example.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.FoodRepo;
import com.example.demo.user.Food;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	FoodRepo foodRepo;

	@Test
	void contextLoads() {
		System.out.print("hello =>");

		Optional<Food> food = foodRepo.findById(1);
		System.out.println(food);
		
		java.util.List<Food> findByUserid = foodRepo.findByUserid(1);
		for (Food food2 : findByUserid) {
			System.out.println(food2);
		}
		System.out.println(findByUserid.toString());
	}

}
