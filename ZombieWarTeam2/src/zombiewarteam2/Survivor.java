package zombiewarteam2;

/**
 *
 * @author Dan Sager
 * CSC 422
 */
public abstract class Survivor {


    //variables
    private String name;
    private int health;
    private int damage;
    private Weapon weapon;
    /* //not really sure if we need these anymore
    boolean hasWeapon; 
    String weaponName;
    int weaponDamage;
    */
//    public Survivor(Weapon weapon){
//        this.weapon = weapon;
//    }
    
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public Weapon getWeapon(){
        return weapon;
    }
    //methods
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override 
    public String toString(){
        return this.getName();
    }
    
        /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
    public void Attack(Zombie z){ //needs zombie class still or make a super class of Character for Zombie and Survivor.
        //o.health -= attack;
        
    }
    
    public void die(){
      if(getHealth()<=0){
          
      }  
    }
    // Will testing push //
}