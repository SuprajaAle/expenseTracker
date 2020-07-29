package com.example.demo.dao;

import com.example.demo.user.Food;
import com.example.demo.user.Others;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OthersRepo extends JpaRepository<Others,Integer> {
}
