/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorydesignpattern;

/**
 *
 * @author obada alzidi
 */
public abstract class Pizza {
    
    private double price;
    private String name;
    
    public void setPrice(double price) {this.price = price;}
    public double getPrice() {return this.price;}
    
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    
    
}
