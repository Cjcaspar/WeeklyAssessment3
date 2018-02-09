package com.company.Question_1;

import java.util.Scanner;

public class Character {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int health;
    private int damage;
    private int armor;

    public Character(String name, int health, int damage, int armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }
    public Character () {
        setName("Tom");
        setHealth(100);
        setDamage();
        setArmor(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() {
        damage = 4 + (int) (Math.random() * 7);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
