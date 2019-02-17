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
// CommonInfect extends the Zombie abstract class
public class Tank extends Zombie {

//    public int health = 30;
//    public int attack = 5;
    // CommonInfect Constructor
    public Tank(String name) {
        super.setName(name); //changed name to add # next to the object for formatting. 
        super.setHealth(150);
        super.setDamage(20);
    }
}

//    // Override Methods for loseEnergy and kill.
//    @Override
//    public void loseEnergy() {
//
////        System.out.println("Common Infect health is " + health);
//    }
//
//    @Override
//    public void kill() {
//
////        System.out.println("Common Infect attack is " + attack);
//    }
//
//}
