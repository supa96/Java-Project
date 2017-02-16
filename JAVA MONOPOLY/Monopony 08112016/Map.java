/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopony;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Phustih
 */
public class Map {
    private ArrayList<Block> map;

    public ArrayList<Block> getMap() {
        return map;
    }
    
    public Map() {
        map = new ArrayList();
        map.add(0,new Start(0,"start","ddd",200000));
        map.add(1,new Deed(1,"Jacob Field","/Pic/jacobfield.jpg",20000));
        map.add(2,null);
        map.add(3, new Deed(3,"Texas Stadium","/Pic/texasstadium.jpg",40000));
        map.add(4, new Deed(4,"Tax","/Pic/TAX",2000000));
        map.add(5, new Station(5,"ORD_AIRPORT","/pic/ORD_AIRPORT.jpg",250000));
        map.add(6,new Deed(6,"Grand Ole Opry","/Pic/grand_ole_opry.jpg",60000));
        map.add(7, null);
        map.add(8, new Deed(8,"Gateway of Arch","/Pic/gateway.jpg",60000));
        map.add(9, new Deed(9,"Mall of America","/Pic/mallofamerica",80000));
        map.add(10, new Jail());
        map.add(11, new Deed(11,"Olypic park","/Pic/olympic_park",100000));
        map.add(12, new Station(11,"Mobile Service","MIGHTY_FIBRE",250000));
        map.add(13, new Deed(13,"Red Rocks","/pic/redrocks.jpg",100000));
        map.add(14, new Deed(14,"Liberty Bell","/pic/libertybell.jpg",120000));
        map.add(15, new Station(15,"LAD","LAD_AIRPORT.jpg",250000));
        map.add(16, new Deed(16,"South Beach","/pic/southbeach.jpg",140000));
        map.add(17, null);
        map.add(18, new Deed(18,"Jason Space Center","/pic/johnson.jpg",140000));
        map.add(19, new Deed(19,"Pioneer Square","/pic/pioneer_square.jpg",160000));
        //map.add(20, new FreeParking());
        map.add(21, new Deed(21,"Cameback","/pic/cameback.jpg",180000));
        map.add(22, null);
        map.add(23, new Deed(23,"Waikiki Beach","/pic/waikiki_beach.jpg",180000));
        map.add(24, new Deed(24,"Disney World","/pic/disneyworld.jpg",200000));
        map.add(25, new Station(25,"JFK","JFK_AIRPORT.jpg",250000));
        map.add(26, new Deed(26,"French Quater","/pic/frenchquater.jpg",220000));
        map.add(27, new Deed(27,"Hollywood","/pic/hollywood.jpg",220000));
        map.add(28, new Station(28,"Internet Service","MIGHTY_MOBILE",250000));
        map.add(29, new Deed(29,"Golden Gate","/pic/goldengatebeidge.jpg",240000));
        //map.add(30, new GoToJail(30,"goJail"));
        map.add(31, new Deed(31,"Las Vegas","/pic/lasvegas.jpg",260000));
        map.add(32, new Deed(32,"Wrigley Field","/pic/wrigleyfield.jpg",260000));
        map.add(33, null);
        map.add(34, new Deed(34,"Whitehouse","/pic/whitehouse.jpg",280000));
        map.add(35, new Station(35,"ATL","ATL_AIRPORT.jpg",250000));
        map.add(36, null);
        map.add(37, new Deed(37,"Fenway Park","/pic/fenwaypark.jpg",350000));
        map.add(38, new Deed(38,"Credit","/pic/CREDITCARDDEBIT.jpg",750000));
        map.add(39, new Deed(39,"Time Square","/pic/time_square.jpg",500000));
        
    }
   
    
}
