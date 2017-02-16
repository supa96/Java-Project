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
public class Jail implements Block {
    private int index;
    private String name;
    private String pic;

    public Jail() {
        this.index = 20;
        this.name = "Jail";
        this.pic = pic;
    }

    public int getIndex() {
        return this.index;
    }
        
    @Override
    public void action(Player a) {
        
    }

    @Override
    public String getPic(){
        return pic;
    }
    
}
