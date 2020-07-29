package com.example.demo.dao;

import com.example.demo.user.Food;
import com.example.demo.user.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepo extends JpaRepository<Shopping,Integer> {
}
