package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    @Test
    void attack() {
        int heroHP = 10;
        Hero hero1 = new Hero("テストhero", heroHP,5);
        Enemy enemy1 = new Enemy("テストenemy1",0,3);
        enemy1.setDead(true);
        for (int i = 0; i < 10; i++) {
            hero1.attack(enemy1);
            enemy1.attack(hero1);//攻撃するかを確かめる
            assertEquals(hero1.getHitPoint(), heroHP);
        }
    }

}