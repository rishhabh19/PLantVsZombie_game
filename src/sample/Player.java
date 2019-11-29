package sample;

public class Player {
    private String username;
    public Game Player_Game;
    Player(String s ){
        username= s;
        Player_Game= new Game();
    }
    
    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }
}
