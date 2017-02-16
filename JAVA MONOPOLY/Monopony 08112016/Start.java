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
public class Start implements Block {

    private int salary;
    private int index = 0;
    private String name = "";
    private String pic = "";

    public Start(int index, String name, String pic,int value) {
        this.index= index;
        this.name = name;
        this.pic = pic;
        this.salary = salary;
    }

    @Override
    public void action(Player a) {
        a.recieve(this.salary);
    }

    @Override
    public String getPic() {
        return pic;
    }

}
