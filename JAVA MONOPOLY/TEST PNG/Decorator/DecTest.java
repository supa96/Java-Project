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
public class DecTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Beverage b1 = new Coffee();
        b1 = new Whip(b1);
        b1 = new Milk(b1);
        b1 = new Milk(b1);
        System.out.println(b1.getDesc());
        System.out.println(b1.getCost());
        
        
        System.out.println();
        Beverage b2 = new Cocoa();
        b2 = new Milk(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDesc());
        System.out.println(b2.getCost());
    }
    
}
