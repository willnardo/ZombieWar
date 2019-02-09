/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Mohamed
 */

// Main class for our Zombie Team Project

public class Main {
    
    // Main method for our Java program
    
  public static void main(String[] args) {

      
      // Creating a CommonInfect object which holds the health and attack of 30 and 5
     
      CommonInfect commoninfect = new CommonInfect(30,5);
      
      commoninfect.loseEnergy();
      
      commoninfect.kill();
      
       
     //Creating a Tank object which holds the health and attack of 150 and 20.

      Tank tank = new Tank(150,20);
      
      tank.loseEnergy();
      
      tank.kill();
      

   }
}
