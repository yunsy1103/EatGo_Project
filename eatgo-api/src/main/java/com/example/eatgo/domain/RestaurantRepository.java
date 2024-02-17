package com.example.eatgo.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findById(Long id);
}
