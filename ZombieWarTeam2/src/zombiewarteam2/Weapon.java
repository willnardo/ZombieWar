/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewarteam2;

/**
 *
 * @author Aladdin
 * 100 CSC 422 Software Engineering
 */
public abstract class Weapon {
    
    //Varibles
    private String name; //Weapon name
    private int damage; //Weapon damage
    private double accuracy; //Weapon accurancy
    
    
    //Methods
    @Override
    public String toString(){
        return this.getName();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public double getAccuracy(){
        return accuracy;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public void setAccuracy(double accuracy){
        this.accuracy = accuracy;
    }
}