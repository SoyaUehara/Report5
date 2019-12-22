package jp.ac.uryukyu.ie.e195752;

public class Enemy extends LivingThing{
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        int hitPoint = getHitPoint();
        String name = getName();
        hitPoint -= damage;
        setHitPoint(hitPoint);
        if (hitPoint <= 0) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
}
