package zombiewarteam2;

/**
 *
 * @author Dan Sager CSC 422
 */
public class Teacher extends Survivor {
//    int health = 50;
//    int attack = 5;  

    public Teacher(Weapon weapon) {
        super.setName("Teacher"); //changed name to add # next to the object for formatting.
        super.setHealth(50);
        super.setWeapon(weapon);
        super.setDamage(10 + super.getWeapon().getDamage());

    }

    public Teacher(String name) {
        super.setName("Teacher"); //changed name to add # next to the object for formatting.
        super.setHealth(50);
        super.setDamage(5);

    }

    // Will testing push //
}
