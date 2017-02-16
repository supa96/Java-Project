/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.util.ArrayList;

/**
 *
 * @author visio
 */
public class Player {

    private int index;
    private String name;
    private int money;
    private boolean free_park;
    private ArrayList<Station> stations = new ArrayList();
    private ArrayList<Deed> deeds = new ArrayList();
    private ArrayList<Card> cards = new ArrayList();

    public Player(int index, String name, int money) {
        this.index = index;
        this.name = name;
        this.money = money;
        this.free_park = false;
    }

    public boolean isFree_park() {
        return free_park;
    }

    public void setFree_park(boolean free_park) {
        this.free_park = free_park;
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void buy(Deed d) {
        this.deeds.add(d);
        d.setOwner(this);
    }

    public void buy(Station s) {
        this.stations.add(s);
        s.setOwner(this);
    }

    public void sell(Deed d) {
        if (deeds.contains(d)) {
            this.deeds.remove(d);
            d.setOwner(null);
        }
        
    }

    public void sell(Station s) {
        this.stations.remove(s);
        s.setOwner(null);
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public ArrayList<Deed> getDeeds() {
        return deeds;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void pay(int money) {
        this.money -= money;
    }

    public void recieve(int money) {
        this.money += money;
    }

    public void take_turn(int number) {
        this.index += number;
    }

    public void settle(Deed deed) {
        for (Deed d : this.deeds) {
            if (deed == d) {

            }
        }
    }

    public void add_card(Card card) {
        this.cards.add(card);
    }
}
