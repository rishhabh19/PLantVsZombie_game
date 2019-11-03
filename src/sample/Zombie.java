package sample;

public abstract class Zombie {
    private int Xpos;
    private int Ypos;
    private int health;
    public int status;

    public void setXpos(int x){
        Xpos=x;
    }
    public void setYpos(int y){
        Ypos= y;
    }
    public void setHealth(int h){
        health=h;
    }
    public int getXpos(){
        return Xpos;
    }
    public int getYpos(){
        return Ypos;
    }
    public int getHealth(){
        return health;
    }

}
