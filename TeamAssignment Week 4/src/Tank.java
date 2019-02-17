/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mohamed
 */

// Tank extends the Zombie abstract class

public class Tank extends Zombie{
    
    public int health = 150;
    
    public int attack = 20;

    
    // Tank Constructor
    
    public Tank(int health, int attack) {
        super(health, attack);
    }

    // Override methods for loseEnergy and kill.
    
    @Override
    public void loseEnergy() {

         System.out.println("Tank health is " + health);
    }

    @Override
    public void kill() {

        System.out.println("Tank attack is " + attack);
    }
    
}
