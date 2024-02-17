package com.example.eatgo.application;

import com.example.eatgo.domain.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class RestaurantServiceTest {

    private RestaurantService restaurantService;
    private RestaurantRepository restaurantRepository;
    private MenuItemRepository menuItemRepository;

    @Before
    public void setup(){
        menuItemRepository = new MenuItemRepositoryImpl();
        restaurantRepository = new RestaurantRepositoryImpl();
        restaurantService = new RestaurantService(restaurantRepository,menuItemRepository);
    }//모든 테스트 실행 전 실행되는 것 (Before)

    @Test
    public void getRestaraunt(){
        Restaurant restaurant = restaurantService.getRestaurant(1004L);
        assertThat(restaurant.getId(),is(1004L));
        MenuItem menuItem = restaurant.getMenuItem().get(0);
        assertThat(menuItem.getName(),is("Kimchi"));
    }

    @Test
    public void getRestaurants(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        Restaurant restaurant = restaurants.get(0);
        assertThat(restaurant.getId(),is(1004L));


    }
}