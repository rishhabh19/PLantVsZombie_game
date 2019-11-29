package sample;

import java.util.ArrayList;

public class Lawn {
    private ArrayList<Zombie> zombies;
    private ArrayList<Plant> plants;
    private boolean LawnMover;

    public Lawn()
    {
        this.zombies=new ArrayList<Zombie>();
        this.plants=new ArrayList<Plant>();
        this.LawnMover=true;
    }

    public void addPlant(Plant plant,int location){
        plants.add(plant);
    }

    public void removePlant(Plant plant,int location){
        plants.remove(plant);
    }
}
