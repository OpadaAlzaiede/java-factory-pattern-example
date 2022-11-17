/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorydesignpattern;

import java.util.Scanner;

/**
 *
 * @author obada alzidi
 */
public class FactoryDesignPattern {

    public static void main(String[] args) {
        
        PizzaFactory factory = new PizzaFactory();
        Pizza userPizza = null;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("what type if pizza you want? (N/ I/ G)");
        
        if(input.hasNextLine()) {
            
            String userOption = input.nextLine();
            
            userPizza = factory.makePizza(userOption);
        }
        
        System.out.println("You Have: " + userPizza.getName() + ", price: " + userPizza.getPrice());
        input.close();
    }
}
