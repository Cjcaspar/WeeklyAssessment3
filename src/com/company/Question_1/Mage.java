package com.company.Question_1;

public class Mage extends Character {
    private int mana;

    public Mage(String name, int health, int damage, int armor, int mana) {
        super(name, health, damage, armor);
    }

    public Mage() {
        setMana(100);

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }


}
