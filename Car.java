//import necessary classes
import java.util.*;
import java.io.*;

public abstract class Car {
  //properties
  private String plate;
  private String colour;
  private int doors;
  private int speed;
  private int maxSpeed;
  
  /**
   * Constructor.
  */
  public Car(String pNum, String col, int numDoor, int maxVel)  {
    plate = pNum;
    colour = col;
    doors = numDoor;
    speed = 0;
    maxSpeed = maxVel;
  }
  
  /**
   * Accelerate Method.
  */
  public void accel()  {
    //accelerate the vehicle
    if (speed < maxSpeed) {
      speed++;
    } else  {
      System.out.println("Unable to speed up");
    }
    
    //return the new speed
    System.out.println("Speed increased to " + speed);
  }
  
  /**
   * Brake Method.
  */
  public void brake()  {
    //decelerate the vehicle
    speed--;
    
    //return the new speed
    System.out.println("Speed reduced to " + speed);
  }
  
  /**
   * Get Speed Method
  */
  public void getSpeed() {
    //return the speed to the user
    System.out.println("Speed is " + speed);
  }
  
  /**
   * Get Max Speed Method
  */
  public void getMaxSpeed()  {
    //return the max speed possible
    System.out.println("Max speed is " + speed);
  }
  
  /**
   * Change plates Method.
  */
  public void changePlates()  {
    System.out.println("That's illegal!");
  }
  
  public void print() {
    try {
      //create the text file
      File myObj = new File("Car_Stats.txt");
      
      //create the filewriter and wrap in bufferedwriter
      FileWriter fileWriter = new FileWriter(myObj);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      //write the data to the text file
      bufferedWriter.writeLn("Plate Number: " + plate);
      bufferedWriter.write("Colour: " + colour);
      bufferedWriter.write("Number of Doors:" + doors);
      bufferedWriter.write("Current Speed: " + speed);
      bufferedWriter.write("Max Speed: " + maxSpeed);
      
      //close the buffered writer
      bufferedWriter.close();
    } catch(Exception e) {
    }
  }
}