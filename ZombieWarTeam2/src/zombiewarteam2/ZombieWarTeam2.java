/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewarteam2;

import java.util.ArrayList;
import java.util.Random;

public class ZombieWarTeam2 {

    //variables
    Random rn = new Random();
    public int decider;
    public int survivorCount = rn.nextInt(19 - 0 + 1) + 1;
    public int teacherCount = 0;
    public int childCount = 0;
    public int soldierCount = 0;

    public int zombieCount = rn.nextInt(19 - 0 + 1) + 1;
    public int commonInfectCount = 0;
    public int TankCount = 0;


    /*
    createSurvivors will be used to create random survivors. 
    My idea is that there will be a random number generator that will set the amount of survivors.
    When createSurvivors is called, it will go through for loop, at each iteration, it will generate a new
    random # that will determine what type of survivor to make.
     */
    public ArrayList<Survivor> createSurvivors() {
        //System.out.println("SURVIVOR COUNT: " + survivorCount);
        //local variable
        String tempName;
        //
        ArrayList<Survivor> survivorList = new ArrayList<>();
        //
        for (int i = survivorCount; i > 0; i--) {
            //generate random number
            decider = rn.nextInt(8 - 0 + 1) + 1;
            if (decider >= 0 && decider < 4) {
                //create teacher
                //set teacher name
                tempName = "Teacher" + teacherCount;
                //create new teacher with name
                survivorList.add(new Teacher(tempName));
                //increment counter
                teacherCount++;
            }
            if (decider > 3 && decider < 7) {
                //create child
                //set child name
                tempName = "Child" + childCount;
                //create new teacher with name
                survivorList.add(new Child(tempName));
                //increment counter
                childCount++;
            }
            if (decider > 6 && decider < 10) {
                //create soldier
                //set soldier name
                tempName = "Soldier" + soldierCount;
                //create new Soldier with name
                survivorList.add(new Soldier(tempName));
                //increment counter
                soldierCount++;
            }
        }

        return survivorList;
    }

    public ArrayList<Zombie> createZombies() {
        //System.out.println("ZOMBIE COUNT: " + zombieCount);
        //local variable
        String tempName;
        //
        ArrayList<Zombie> zombieList = new ArrayList<>();
        //
        for (int i = zombieCount; i > 0; i--) {
            //generate random number
            decider = rn.nextInt(8 - 0 + 1) + 1;
            if (decider > 0 && decider < 5) {
                //create common infected
                //set common infected name
                tempName = "Common Infected" + commonInfectCount;
                //create new common infected with name
                zombieList.add(new CommonInfect(tempName));
                //increment counter
                commonInfectCount++;
            }
            if (decider > 4 && decider < 10) {
                //create tank
                //set tank name
                tempName = "Tank" + TankCount;
                //create new tank with name
                zombieList.add(new Tank(tempName));
                //increment counter
                TankCount++;
            }

        }

        return zombieList;
    }

    /////////////////////////// MAIN //////////////////////////////////
    public static void main(String[] args) {
        // used for attacking loop below
        int tempHealth;
        //create arraylist
        ZombieWarTeam2 s = new ZombieWarTeam2();
        ZombieWarTeam2 z = new ZombieWarTeam2();
        //populate survivor arraylist
        ArrayList<Survivor> survivorList = s.createSurvivors();
        ArrayList<Zombie> zombieList = z.createZombies();
        //test print for survivors
        // Will testing push //
        
        //inserting initial character prints to format correctly.
        // Release 2 output
        System.out.println("We have " + s.survivorCount + " survivors trying to make it to safety. (" + s.childCount + " children, " + s.teacherCount + " teacher(s), and " + s.soldierCount + " soldier(s))");
        System.out.println("But there are " + z.zombieCount + " zombies waiting for them.(" + z.commonInfectCount + " common infected and " + z.TankCount + " tank(s)" );
        
        
//         ---------- UNCOMMENT THIS SECTION TO SEE WHAT SURVIVORS AND ZOMBIES ARE GENERATED ---------
//
//        survivorList.forEach((Survivor) -> {
//            System.out.println(Survivor + " Health: " + Survivor.getHealth()
//                    + " --- Damage: " + Survivor.getDamage());
//        });
//
//        zombieList.forEach((Zombie) -> {
//            System.out.println(Zombie + " Health: " + Zombie.getHealth()
//                    + " --- Damage: " + Zombie.getDamage());
//        });



        // The while loop will have each list of survivors and zombies attack eachother until one list is empty
        while (!survivorList.isEmpty() && !zombieList.isEmpty()) {

            // Survivors Attack! 
            for (int i = 0; i < survivorList.size(); i++) {
                for (int k = 0; k < zombieList.size(); k++) {
                    //Storing the current zombie's health
                    tempHealth = zombieList.get(k).getHealth();
                    //If zombie has health, it takes an attack
                    if (tempHealth > 0) {
                        // I am taking the tempHealth - survivors Damage rating and using setHealth to update the health
                        zombieList.get(k).setHealth(tempHealth - survivorList.get(i).getDamage());
                    }
                    // If zombie has less than 1 health (0 or less), it is removed from the list
                    if (tempHealth < 1) {
                        System.out.println(survivorList.get(i).getName() + " killed " + zombieList.get(k).getName());
                        zombieList.remove(k);
                        
                    }
                }
            }

            //Zombies Attack!    
            //Same has loop above, just switching the lists so zombies attack, see notes above
            for (int i = 0; i < zombieList.size(); i++) {
                for (int k = 0; k < survivorList.size(); k++) {
                    //Storing the current
                    tempHealth = survivorList.get(k).getHealth();
                    if (tempHealth > 0) {
                        survivorList.get(k).setHealth(tempHealth - zombieList.get(i).getDamage());
                    }
                    if (tempHealth < 1) {
                        System.out.println(zombieList.get(i).getName() + " killed " + survivorList.get(k).getName());
                        survivorList.remove(k);
                        
                        
                    }
                }
            }

            //System.out.print("Battle");
        }

        /*// Release 1 output
        System.out.println("We have " + s.survivorCount + " survivors trying to make it to safety.");
        System.out.println("But there are " + z.zombieCount + " zombies waiting for them.");
        
        if (!survivorList.isEmpty()) {
            System.out.println("It seems " + survivorList.size() + " have made it to safety");
        } else {
            System.out.println("None of the survivors made it.");
        }*/
        
        

        
        
        

        
        if (!survivorList.isEmpty()) {
            System.out.println("It seems " + survivorList.size() + " have made it to safety");
        } else {
            System.out.println("None of the survivors made it.");
        }
        

    }

}

/* Release 1 output
    System.out.print("We have " + survivorVariable + " survivors trying to make it to safety.");
    System.out.print("But there are " + zombieVariable + " zombies waiting for them.");
    System.out.print("It seems " + variable + " have made it to safety.");
 */
 /* Release 2 output
    System.out.print("We have " + survivorVariable + " survivors trying to make it to safety. (" + childrenVariable + " children, " + teacherVariable " teacher(s), and " + soldierVariable + " soldier(s))" );
    System.out.print("But there are " + zombieVariable + " zombies waiting for them.(" + commonVariable + " common infected and " + tankVariable " tank(s)" );
    if(survivorVariable==0){
      System.out.print("None of the survivors made it.");  
    }
    else{
        System.out.print(survivorVariable + " of the survivors made it.");
    }
 */
