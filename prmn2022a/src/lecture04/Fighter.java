package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint,int power,String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.hitPoint -= power;
        System.out.println( name + "は" + enemy.name + "に" + power + " ダメージを与えた!!");
    }

    public boolean Alive(){
        return hitPoint>0;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public void setHitPoint(int hitPoint){
        if(0<hitPoint){
            System.out.println("error");
        }else{
            this.hitPoint = hitPoint;
        }
    }

    public  String getName(){
        return name;
    }

}
