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
public class Whip extends Decorate {

    Beverage thisBev;

    public Whip(Beverage b) {
        thisBev = b;
    }

    @Override
    public String getDesc() {
        return thisBev.getDesc() + ", Whip";
    }

    @Override
    public double getCost() {
        return thisBev.getCost() + 20;
    }

}
