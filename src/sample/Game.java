package sample;

public class Game {
    public Narrator narrator;
    private int level;
    private int sunCount;

    public void setLevel(int level)
    {
        this.level=level;
    }

    public int getLevel()
    {
        return this.level;
    }

    public void setSunCount(int sunCount)
    {
        this.sunCount=sunCount;
    }

    public int getSunCount(){
        return this.sunCount;
    }
}
