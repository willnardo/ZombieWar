package zombiewarteam2;

/**
 *
 * @author Dan Sager CSC 422
 */
public class Soldier extends Survivor {
//    int health = 100;
//    int attack = 10;

    // Will testing push //
    public Soldier(Weapon weapon) {
        super.setName("Soldier"); //changed name to add # next to the object for formatting.
        super.setHealth(100);
        super.setWeapon(weapon);
        super.setDamage(10 + super.getWeapon().getDamage());
    }

    public Soldier(String name) {
        super.setName("Soldier"); //changed name to add # next to the object for formatting.
        super.setHealth(100);
        super.setDamage(10);

    }
}
