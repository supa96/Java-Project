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
public class FreeParking implements Block{

    @Override
    public void action(Player a) {
        a.setFree_park(true);
    }
    
}
