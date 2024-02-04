package com.example.eatgo.interfaces;

import com.example.eatgo.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {
    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L,"Bob zip","Seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food","Seoul"));

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){ //파라미터 값
        List<Restaurant> restaurants = new ArrayList<>();//컬렉션에 리스트 만들어서 아이디에 나오는 결과값 구별

        restaurants.add(new Restaurant(1004L,"Bob zip","Seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food","Seoul"));
        
        Restaurant restaurant = restaurants.stream()
                .filter(r->r.getId().equals(id))
                .findFirst()
                .get(); //레스토랑에 있는 아이디 찾아서 아이디 값 가져오기

        return restaurant;
    }
}
