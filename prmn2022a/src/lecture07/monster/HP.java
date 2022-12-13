package lecture07.monster;

public class HP {
    private int hp;
    private int dead = 0;

    public boolean isAlive(){
        if(dead==0){
            return true;
        }
        return false;
    }

    public int getHp(){
        return hp;
    }
}
