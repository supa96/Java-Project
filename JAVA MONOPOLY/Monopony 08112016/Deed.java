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
public class Deed implements Block {

    private int index;
    private String name;
    private Player owner;
    private int price;
    private boolean bought;
    private int house;
    private boolean hotel;
    private String pic;
    private int fine;

    public Deed(int index, String name, String pic, int price) {
        this.index = index;
        this.owner = null;
        this.name = name;
        this.price = price;
        this.pic = pic;
        bought = false;
        house = 0;
        hotel = false;
        owner = null;
    }

    public String getPic() {
        return pic;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner.getName();
    }

    public void add_house() {
        if (this.house <=3 ) {
            this.house += 1;
        }
    }

    public void remove_house() {
        if (this.house > 0) {
            this.house -= 1;
        }
    }
    
    public void add_hotel() {
        if (!this.hotel) {
            this.hotel = true;
        }
    }

    public void remove_hotel() {
        if (this.hotel) {
            this.hotel = false;
        }
    }

    public int getPrice() {
        return price;
    }

    public boolean isBought() {
        return bought;
    }

    public int getHouse() {
        return house;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    @Override
    public void action(Player a) {
        if (this.owner.isFree_park()) {
            this.owner.setFree_park(false);
        } else if (a != this.owner && this.owner != null) {
            a.pay(this.fine);
            this.owner.recieve(this.fine);
            System.out.println(this.fine);
        }
    }

}
