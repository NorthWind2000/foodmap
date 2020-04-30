package cn.henu.one.controller;

import cn.henu.one.bean.Afood;
import cn.henu.one.bean.Customer;
import cn.henu.one.mapper.FoodMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FoodController {
    @Autowired
    FoodMapper foodMapper;

    @GetMapping("/food_all")
    @CrossOrigin
    public ArrayList<Afood> getAll(){
        ArrayList<Afood> foods=foodMapper.getFoodAll();
        return foods;
    }

    @PostMapping("/delete_food/{id}")
    @CrossOrigin
    public void deleteFood(@PathVariable("id") Integer id) {
        foodMapper.deleteFoodById(id);
    }
}
