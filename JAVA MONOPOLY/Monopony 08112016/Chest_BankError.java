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
public class Chest_BankError extends Chest { 
    int index = 0; 
    String name = "Bank Error";
    String pic;

    public Chest_BankError (String name, String pic) {
       this.name = name; 
       this.pic = pic;
    }

    @Override
    int movement(Player a) { 
         int m = a.getMoney(); 
         int f = m += 200000; 
         a.setMoney(f);
         return f;
        
    }

    @Override
    public String getPic() {
        return pic; //To change body of generated methods, choose Tools | Templates.
    }

   


 
}
