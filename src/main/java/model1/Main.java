package model1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player>players=new ArrayList<>();


        players.add(new Player(1,"Muhammed",19,80,false));
        players.add(new Player(2,"Saleh",23,90,false));
        players.add(new Player(3,"Aydan",20,70,true));
        players.add(new Player(4,"Taleh",23,65,false));
        players.add(new Player(5,"Aytac",25,90,true));
        players.add(new Player(6,"Ali",18,30,false));


        players.sort(Comparator.comparingInt((Player p) -> p.score).reversed()
                .thenComparing(p -> !p.isFemale)
                .thenComparingInt(p -> p.age)
                .thenComparing((Player p) -> p.name, Comparator.reverseOrder())
                .thenComparingInt(p -> p.id));


       for(Player p:players) {
           System.out.println(p);
       }
    }
}
