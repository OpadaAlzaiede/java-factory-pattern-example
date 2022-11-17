/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorydesignpattern;

/**
 *
 * @author obada alzidi
 */
public class PizzaFactory {
    
    public Pizza makePizza(String choice) {
        
        if(choice.equalsIgnoreCase("N"))
            return new NormalPizza();
        
        if(choice.equals("I"))
            return new ItalianPizza();
        
        if(choice.equalsIgnoreCase("G"))
            return new GreekPizza();
        
        return null;
    }
}
