/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

/**
 *
 * @author Supachai
 */
abstract public class Chest implements Block { 
    String name; 
    String pic;  
    
    abstract int movement(Player a); 
    @Override 
    public void action(Player a){
        
    }
    
    
    
    
}
