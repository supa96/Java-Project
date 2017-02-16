/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author visio
 */
public class Corner implements Block {

    private int index;
    private String name;
    private String map_path;
    private String deed_path;
    private JPanel map_panel;
    private JLabel map_label;
    private String dialog_path;
    private JLabel dialog_label;
    private int price;
    private String owner_name;
    private JDialog showcard;

    public Corner(int index, String name, String map_path, int price, String dialog_path) {
        this.index = index;
        this.name = name;
        this.dialog_path = dialog_path;
        this.owner_name = "Government";
        this.map_path = map_path;
        this.deed_path = "";
        this.price = price;
        this.map_panel = new JPanel();
        this.map_label = new JLabel();
        this.showcard = new JDialog();
        this.dialog_label = new JLabel();
        this.map_label.setIcon(new ImageIcon(getClass().getResource(this.map_path)));
        this.map_panel.add(this.map_label);
        this.dialog_label.setIcon(new ImageIcon(getClass().getResource(this.dialog_path)));
        
        //map_label.setIcon(new ImageIcon(getClass().getResource("/Pic/tony.png")));
        //map_panel.add(map_label);
    }

    public String getDialog_path() {
        return dialog_path;
    }

    public JLabel getDialog_label() {
        return dialog_label;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void action(Player player) {
        if (this.getName().equals("Go")) {
            this.showcard.setLayout(new BorderLayout());
            this.showcard.add(dialog_label, BorderLayout.CENTER);
            this.showcard.setSize(291, 197);
            this.showcard.setAlwaysOnTop(true);
            this.showcard.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            this.showcard.setLocation(650, 350);
            this.showcard.setVisible(true);
            player.takeMoney(2000000);
            player.addMoney(2000000);

        } else if (this.getName().equals("Jail")) {
            this.showcard.setLayout(new BorderLayout());
            this.showcard.add(dialog_label, BorderLayout.CENTER);
            this.showcard.setSize(291, 197);
            this.showcard.setAlwaysOnTop(true);
            this.showcard.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            this.showcard.setLocation(650, 350);
            this.showcard.setVisible(true);
            player.takeMoney(2000000);
        } else if (this.getName().equals("Go Jail")) {
            this.showcard.setLayout(new BorderLayout());
            this.showcard.add(dialog_label, BorderLayout.CENTER);
            this.showcard.setSize(291, 197);
            this.showcard.setAlwaysOnTop(true);
            this.showcard.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
            this.showcard.setLocation(650, 350);
            this.showcard.setVisible(true);
            player.takeMoney(2000000);
            player.setIndex(10);
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
        this.deed_path = p;
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
