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
public class Axe extends Weapon{
    
    //Constructor
    public Axe(String name){
        //Not sure how to do the types yet if it is just the same as name
        super.setName(name);
        super.setDamage(7);
        super.setAccuracy(9/10);
    }
    
}
