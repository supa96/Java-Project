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
public class Station implements Block{
    private String name;
    private String pic;
    private int index;
    private int price;
    private boolean bought;
    private Player owner;
    private int fine;

    public Station( int index, String name,String pic, int price ) {
        this.name = name;
        this.pic = pic;
        this.index = index;
        this.price = price;
        this.bought = false;
        this.owner = null;
        this.fine = 0;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBought() {
        return bought;
    }

    public Player getOwner() {
        return owner;
    }

    public int getFine() {
        return fine;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

   
    
    @Override
    public void action(Player a) {
        if(this.owner.isFree_park()){
            this.owner.setFree_park(false);
        }
        else if(this.owner != a && this.owner != null){
            a.pay(this.fine);
            this.owner.recieve(this.fine);
            System.out.println(a.getName()+ " paid $"+this.fine);
        }
    }

    @Override
    public String getPic() {
        return pic;
    }
    
}
