package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.user.Food;

public interface FoodRepo extends JpaRepository<Food, Integer> {

	List<Food> findByUserid(int id);

}
