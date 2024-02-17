package com.example.eatgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class MenuItem {
    private String name;

    @Id
    @GeneratedValue//값 설정
    private Long id;

    private Long restaurantid;


    public MenuItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
//메뉴 목록