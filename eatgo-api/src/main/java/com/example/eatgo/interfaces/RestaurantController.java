package com.example.eatgo.interfaces;

import com.example.eatgo.domain.Restaurant;
import com.example.eatgo.domain.RestaurantRepository;
import com.example.eatgo.domain.RestaurantRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    private RestaurantRepository repository;
    @GetMapping("/restaurants")
    public List<Restaurant> list(){

        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){ //파라미터 값
       Restaurant restaurant = repository.findById(id);//컬렉션에 리스트 만들어서 아이디에 나오는 결과값 구별, repository로 만들어서 수정

        return restaurant;
    }
}
