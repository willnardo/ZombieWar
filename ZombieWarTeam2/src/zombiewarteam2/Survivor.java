
package zombiewarteam2;

import java.util.ArrayList;

/**
 *
 * @author Dan Sager
 * CSC 422
 */
public class Survivor {
    //variables
    String name;
    int health;
    int attack;
    /* //not really sure if we need these anymore
    boolean hasWeapon; 
    String weaponName;
    int weaponDamage;
    */
    
    //methods
    public String getName(){
        return this.name;
    }
    
    @Override 
    public String toString(){
        return this.getName();
    }
    
    
    
    public void performAttack(Object o){ //needs zombie class still or make a super class of Character for Zombie and Survivor.
        //o.health -= attack;
    }
    
    public void die(){
      if(health<=0){
          
      }  
    }
}

