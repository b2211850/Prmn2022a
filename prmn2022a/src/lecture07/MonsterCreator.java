package lecture07;

import lecture07.monster.Monster;

import java.util.Map;
import java.util.function.Supplier;

public class MonsterCreator {
    private int id;
    private Supplier<Monster> supplier;

    private Map<Integer,MonsterCreator>;

    public void viewMonsterList(){};
    public int monsterMinId(){};
    public int monsterMaxId(){};
}
