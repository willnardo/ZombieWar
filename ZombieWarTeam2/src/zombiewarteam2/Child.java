package zombiewarteam2;

/**
 *
 * @author Dan Sager CSC 422
 */
public class Child extends Survivor {

    // Will testing push //
//    int health = 20;
//    int attack = 2;

    public Child(String name) {
        super.setName(name); //changed name to add # next to the object for formatting.
        super.setHealth(20);
        super.setDamage(2);
    }
}
