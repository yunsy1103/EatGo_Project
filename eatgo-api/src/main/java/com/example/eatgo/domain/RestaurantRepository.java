package com.example.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {
    //도네임 모델을 만들어서 데이터 및 컨트롤러 정리(중복 제거)
    //더 많은 가게 관리 가능
    private List<Restaurant> restaurants = new ArrayList<>();
    public RestaurantRepository(){
        restaurants.add(new Restaurant(1004L,"Bob zip","Seoul"));
        restaurants.add(new Restaurant(2020L,"Cyber Food","Seoul"));
    }


    public List<Restaurant> findAll(){

        return restaurants;
    }
    public Restaurant findById(Long id){
        return restaurants.stream()
                .filter(r->r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
