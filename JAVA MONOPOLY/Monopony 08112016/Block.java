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
public interface Block {
    static int index = 0;
    String name = "";
    String getPic();
    void action(Player a);
}
