package lecture07.monster;

import lecture07.skill.Skill;
import java.util.List;

public class Monster implements IMonster{

    private String name;
    private HP hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skill;

    protected Monster(String name,int hp,int power,int defense,int speed, List<Skill> skill){

    }

    protected Monster(IMonster monster){}

    public String getName(){};
    public int getHP(){};
    public void setHP(int hp){};
    public int getPower(){};
    public int getDefense(){};
    public boolean isAlive(){};


}
