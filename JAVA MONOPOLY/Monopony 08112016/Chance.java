/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

/**
 *
 * @author Tanakorn
 */
abstract public class Chance implements Block {

    int index;
    String name;
    String pic;

    abstract public int movement(Player a);
    
    @Override
    public void action(Player a){
        //wait pym 
    }

}
