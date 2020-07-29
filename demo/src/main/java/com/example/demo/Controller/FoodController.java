package com.example.demo.Controller;

import com.example.demo.dao.FoodRepo;
import com.example.demo.dao.UserRepo;
import com.example.demo.user.Food;
import com.example.demo.user.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class FoodController {
    @Autowired
    FoodRepo foodRepo;
    @Autowired
    UserRepo userRepo;

    @GetMapping("/addFood")
    public String addFood(ModelMap map) {
        map.put("food", new Food());
        return "addFoodPage";
    }

    @PostMapping("/getFood")
    public String getFood(@ModelAttribute("food") Food food, ModelMap map) {
        User user = (User) map.get("user");
        System.out.println("user = " + user);
       food.setUserid(user.getId());
       map.put("foodlist",foodRepo.findByUserid(user.getId()) );
     
       
        foodRepo.save(food);


        return "redirect:/welcomePage";
    }


}
