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
public class Coffee extends Beverage{
    public Coffee(){
        this.description = "Coffee";
    }
    @Override
    public double getCost(){
        return 50;
    }

}
