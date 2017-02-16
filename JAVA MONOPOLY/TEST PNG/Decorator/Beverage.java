/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Tanakorn
 */
public abstract class Beverage {
    String description;

    public String getDesc(){
        return this.description;
    }     
    public abstract double getCost();      
    
  
}
