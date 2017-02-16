/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony2;

import javax.swing.*;
/**
 *
 * @author visio
 */
public class Corner implements Block{
    private int index;
    private String name;
    private String map_path;
    private String deed_path;
    private JPanel map_panel;
    private JLabel map_label;
    private int price;
    private String owner_name;
    public Corner(int index, String name, String map_path, int price) {
        this.index = index;
        this.name = name;
        this.owner_name = "Government";
        this.map_path = map_path;
        this.deed_path = "";
        this.price = price;
        this.map_panel = new JPanel();
        this.map_label = new JLabel();
        this.map_label.setIcon(new ImageIcon(getClass().getResource("/Pic/test.png")));
        this.map_panel.add(this.map_label);
        //map_label.setIcon(new ImageIcon(getClass().getResource("/Pic/tony.png")));
        //map_panel.add(map_label);
    }
    
public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
    
    public void action(Player player){
        if(player.getName() != this.owner_name){
            player.addMoney(this.price);
            
        } 
    }
    

    @Override
    public int getIndex() {
        return this.index;
    }

     @Override
    public String getDeedPath() {
        return this.deed_path;
    }

    @Override
    public void setDeedPath(String p) {
        this.deed_path  =p;
    }

    @Override
    public String getMapPath() {
        return this.map_path;
    }

    @Override
    public void setMapPath(String p) {
        this.map_path = p;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int p) {
        this.price = p;
    }

    @Override
    public JPanel getDeed_panel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JPanel getMap_panel() {
        return map_panel;
    }
}
