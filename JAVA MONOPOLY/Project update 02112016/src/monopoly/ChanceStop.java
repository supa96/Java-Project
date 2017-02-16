/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

/**
 *
 * @author visio
 */
public class ChanceStop implements Block { 
    Chance b = new Chance();

    @Override
    public void action(Player a) { 
        if (a.index == 7 || a.index == 22 || a.index == 36){
            b.setVisible(true);
           
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
