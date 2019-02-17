package zombiewarteam2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohamed Mohamed
 */
// This is our Zombie Abstract Class.
public abstract class Zombie {

    private String name;
    private int health; // This is our health variable as type int.
    private int damage; // This is our damage varaibale as type int. 

    // Zombie Constructor
//    public Zombie(int health, int attack) {
//
//        this.health = health;
//        this.attack = attack;
//    }
    @Override
    public String toString() {
        return this.getName();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Zombie() {
//    }
    // Getters
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    // Setters
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Abstract void methods for loseEnergy and kill.
//    public abstract void loseEnergy();
//
//    public abstract void kill();
}