package com.example.eatgo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Restaurant {
    @Id
    @GeneratedValue
    private  Long id;
    private String name;
    private String address;

    @Transient//db처리 안됨.임시 저ㄹ
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(){

    }
    public Restaurant(Long id, String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getInformation(){
        return name + "in" + address;
    }
    public List<MenuItem> getMenuItem(){
        return menuItems;
    }
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }

}
