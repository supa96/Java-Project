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
public class Chance implements Block {
    private int index;
    private String name;
    private String map_path;
    private JLabel label;
    private JPanel panel;
    private String owner_name;
    public Chance(int i,String c) {
        this.index=  i;
        this.name ="Chance";
        this.map_path = c;
        this.label = new JLabel();
        this.panel = new JPanel();
        this.label.setIcon(new ImageIcon(getClass().getResource(this.map_path)));
        this.panel.add(this.label);
        this.owner_name = "Chance";
        
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public String getDeedPath() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDeedPath(String p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(int p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel getDeed_panel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JPanel getMap_panel() {
        return this.panel;
    }

    @Override
    public String getOwner_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOwner_name(String owner_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void action(Player a){
        
    }
    
}
