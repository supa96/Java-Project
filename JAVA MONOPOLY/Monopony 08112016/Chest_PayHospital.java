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
public class Chest_PayHospital extends Chest {
    String name = "Pay Hospital";
    String pic; 

    public Chest_PayHospital(String name, String pic) {
        this.name = name;
        this.pic = pic;
    }
    
    
    

    @Override
    int movement(Player a) {
        int m = a.getMoney();
        int f = m - 100000;
        a.setMoney(f);
        return f;
    }

    @Override
    public String getPic() {
        return pic;
    }

  
    
    
}
