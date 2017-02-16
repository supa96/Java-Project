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
public class GoToJail implements Block{
 private int index;
 private String name;
 private String pic;

    public GoToJail(int index, String name, String pic) {
        this.index = index;
        this.name = name;
        this.pic = pic;
    }
    
    @Override
    public void action(Player a) {
       
    }
    
    public void action(Player a, Jail b) {
       a.setIndex(b.getIndex());
    }

    @Override
    public String getPic() {
        return pic;
    }
    
}
