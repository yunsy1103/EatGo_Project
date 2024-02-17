package com.example.eatgo.interfaces;

import com.example.eatgo.application.RestaurantService;
import com.example.eatgo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){

        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){ //파라미터 값
        Restaurant restaurant = restaurantService.getRestaurant(id);//기본정보 + 메뉴 정보

       // Restaurant restaurant = restaurantRepository.findById(id);//컬렉션에 리스트 만들어서 아이디에 나오는 결과값 구별, repository로 만들어서 수정

        //List<MenuItem> menuItems = menuItemRepository.findAllByRestarauntId(id);
        //restaurant.setMenuItems(menuItems);
        //restaurant.addMenuItem(new MenuItem("Kimchi"));
        return restaurant;
    }
}
