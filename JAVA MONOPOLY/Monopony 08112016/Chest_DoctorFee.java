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
public class Chest_DoctorFee extends Chest { 
    int index = 1; 
    String name = "Doctor Fee";
    String pic;  

    public Chest_DoctorFee(String name, String pic) {
        this.name = name;
        this.pic = pic;
    }

    @Override
    int movement(Player a) {
        int m = a.getMoney();
        int f = m - 125000; 
        a.setMoney(f);
        return f;

    }

    @Override
    public String getPic() {
       return pic; //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
