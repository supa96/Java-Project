/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

/**
 *
 * @author Tanakorn
 */
public class Chance_vacation extends Chance{

    @Override
    public int movement(Player a) {
      a.goOnVacation();
      return 0;
    }

    @Override
    public String getPic() {
        return pic;
    }

    
}
