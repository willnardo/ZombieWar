
package zombiewarteam2;

/**
 *
 * @author Dan Sager
 * CSC 422
 */
public class Soldier extends Survivor{
//    int health = 100;
//    int attack = 10;
    
    // Will testing push //
    
    public Soldier(String name){
        super.setName(name); //changed name to add # next to the object for formatting.
        super.setHealth(100);
        super.setDamage(10);
    }
}
