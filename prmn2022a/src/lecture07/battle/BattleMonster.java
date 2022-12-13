package lecture07.battle;

import lecture07.monster.IMonster;

public class BattleMonster implements IBattleMonster{

    protected BattleMonster(IMonster monster){};
    public void attack(int skillIndex,IMonster opponent){};
    protected void receiveDamage(int damage,IMonster opponent){};
}
