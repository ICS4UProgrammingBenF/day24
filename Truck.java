//import necessary classes
import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Truck extends Car  {
  //properties
  private String wheels;
  private String length;
  
  public Truck(String plate, String colour, int doors, int speed, int maxSpeed, String tires, String length)  {
    super(plate, colour, doors speed, maxSpeed);
    wheels = tires;
  }
  
  public Truck(String tires, String length) {
    wheels = tires;
    this.length = length;
  }
}