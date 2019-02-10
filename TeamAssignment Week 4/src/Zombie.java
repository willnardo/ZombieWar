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
   
    public int health; // This is our health variable as type int.
    
    public int attack; // This is our attack varaibale as type int. 
    
    // Zombie Constructor
    public Zombie(int health, int attack) {   
        
        this.health = health;
        
        this.attack = attack;
    }

    // Getters
    public int Health() {
      
        return health;
    }

    public int Attack() {
      
        return attack;
    }

    // Setters
    public void setHealth(int health) {
       
        this.health = health;
    }

    public void setAttack(int attack) {
       
        this.attack = attack;
    }

   // Abstract void methods for loseEnergy and kill.
    
    public abstract void loseEnergy(); 
  
    public abstract void kill(); 

}
