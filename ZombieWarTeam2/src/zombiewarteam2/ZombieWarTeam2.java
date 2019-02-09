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
    public int decider = rn.nextInt(8-0+1)+1;
    public int survivorCount = rn.nextInt(19-0+1)+1;
    public int teacherCount = 1;
    public int childCount = 1;
    public int soldierCount = 1;
    
    /*
    createSurvivors will be used to create random survivors. 
    My idea is that there will be a random number generator that will set the amount of survivors.
    When createSurvivors is called, it will go through for loop, at each iteration, it will generate a new
    random # that will determine what type of survivor to make.
    */
    
    public ArrayList<Survivor> createSurvivors(){
        //local variable
        String tempName;
        //
        ArrayList<Survivor> s = new ArrayList<>();
        //
        for(int i=survivorCount; i>0; i--){
            //generate random number
            decider = rn.nextInt(8-0+1)+1;
            if(decider>0 && decider<4){
            //create teacher
                //set teacher name
                tempName = "Teacher" + teacherCount;
                //create new teacher with name
                s.add(new Teacher(tempName));
                //increment counter
                teacherCount++;
            }
            if(decider>3 && decider<7){
            //create child
                //set child name
                tempName = "Child" + childCount;
                //create new teacher with name
                s.add(new Child(tempName));
                //increment counter
                childCount++;
            }
            if(decider>6 && decider<9){
            //create soldier
                //set soldier name
                tempName = "Soldier" + soldierCount;
                //create new Soldier with name
                s.add(new Soldier(tempName));
                //increment counter
                soldierCount++;
            }
        } 

        return s;
        }

    
    /////////////////////////// MAIN //////////////////////////////////
    
    
        public static void main(String[] args) {
            //create arraylist
            ZombieWarTeam2 z = new ZombieWarTeam2();
            //populate survivor arraylist
            ArrayList<Survivor> arr = z.createSurvivors();
        //test print for survivors
        // Will testing push //
        arr.forEach((Soldier) -> {
            System.out.println(Soldier);
        });
            System.out.println("We have " + z.survivorCount + " survivors trying to make it to safety.");

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
    
    

