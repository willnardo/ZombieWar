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
public class Shotgun extends Weapon{
    
    //Constructor
    public Shotgun(){
        //Not sure how to do the types yet if it is just the same as name
        super.setName("Shotgun");
        super.setDamage(30);
        super.setAccuracy(1/5);
    }
}
