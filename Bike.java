//import necessary classes
import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Bike extends Car  {
  //properties
  private String wheels;
  private String seats;
  
  public Bike(String colour, int speed, int maxSpeed, String tires, String numSeats)  {
    super(colour, speed, maxSpeed);
    wheels = tires;
    seats = numSeats;
  }
  
  public Bike(String colour, String tires, String numSeats) {
    super(colour, speed, maxSpeed);
    wheels = tires;
    seats = numSeats;
  }
}