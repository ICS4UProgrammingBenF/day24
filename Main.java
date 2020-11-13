//import necessary classes
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Class Main
 */
public abstract class Main {
  public static void main(String[] args)  {
    System.out.print("Would you like to use all the data or just some?");
    Scanner scanner = new Scanner(System.in);
    try {
      int aNum = scanner.nextInt();
      
      if (aNum = 1) {
        try1();
      } else  {
        try2();
      }
    } catch(Exception e) {
    }
  }
  
  public static void try2() {
    Bike bike = new Bike("BLUE", "12", "8");
    Truck truck = new Truck("22", "54");
    System.out.println("Outputted to file");
  }
  
  public static void try1() {
    //create the scanner
    Scanner scanner = new Scanner(System.in);
    
    //declare variables
    String plate1 = "";
    String col1 = "";
    int doors1 = 2;
    int maxSpeed1 = 0;
    String plate2 = "";
    String col2 = "";
    int doors2 = 2;
    int maxSpeed2 = 0;
    boolean valid = false;
    int seats = 0;
    
    
   //getting the data for the first car
    
    //getting the plate number
    //System.out.print("Enter the plate number of the first car: ");
    //plate1 = scanner.nextLine();
    
    //get the colour
    System.out.print("Enter the colour of the bike: ");
    col1 = scanner.nextLine();
    
    //getting number data
    do  {
      try {
        //get the number of doors
        //System.out.print("How many doors does the car have? ");
        //String strDoors1 = scanner.nextLine();
        //doors1 = Integer.parseInt(strDoors1);
        
        //checking that the number of doors is valid
        //if (doors1 <= 0)  {
        //  throw new Exception("Invalid Input");
        //} else  {
        //  valid = true;
        //}
        
        //now get the max speed of the car
        System.out.print("What is the max speed? ");
        String strSpeed1 = scanner.nextLine();
        maxSpeed1 = Integer.parseInt(strSpeed1);
        
        //checking for valid input
        if (maxSpeed1 < 1)  {
          throw new Exception("Invalid Input");
        } else  {
          valid = true;
        }
        
        //get the number of tires
        System.out.print("How many tires? ");
        String strTires = scanner.nextLine();
        tires = Integer.parseInt(strTires);
        
        //check for invalid input
        if (tires <= 1) {
          throw new Exception("Invalid input");
        } else  {
          valid = true;
        }
        
        //get the number of seats
        System.out.print("How many seats? ");
        String strSeats = scanner.nextLine();
        seats = Integer.parseInt(strSeats);
        
        //check for invalid input
        if (seats <= 0) {
          throw new Exception("Invalid input");
        } else  {
          valid = true;
        }
        
      } catch(Exception e) {
        valid = false;
      }
    } while (valid == false);
    
    //create the car object
    Bike bike = new Bike(plate1, col1, doors1, maxSpeed1);
    System.out.println("");
    
    //getting the data for the second car
    
    //getting the plate number
    System.out.print("Enter the plate number of the truck: ");
    plate2 = scanner.nextLine();
    
    //get the colour
    System.out.print("Enter the colour of the truck: ");
    col2 = scanner.nextLine();
    
    //getting number data
    do  {
      try {
        //get the number of doors
        System.out.print("How many doors does the truck have? ");
        String strDoors2 = scanner.nextLine();
        doors2 = Integer.parseInt(strDoors2);
        
        //checking that the number of doors is valid
        if (doors2 <= 0)  {
          throw new Exception("Invalid Input");
        } else  {
          valid = true;
        }
        
        //now get the max speed of the car
        System.out.print("What is the max speed? ");
        String strSpeed2 = scanner.nextLine();
        maxSpeed2 = Integer.parseInt(strSpeed2);
        
        //checking for valid input
        if (maxSpeed2 < 1)  {
          throw new Exception("Invalid Input");
        } else  {
          valid = true;
        }
        
        //get number of tires
        System.out.print("How many wheels does the truck have?");
        String strWheels = scanner.nextLine();
        wheels = Integer.parseInt(strWheels);
        
        //checking for a valid input
        if (wheels <= 3)  {
          throw new Exception("Invalid Input");
        } else  {
          valid = true;
        }
        
        //get the length of the truck//get number of tires
        System.out.print("How long is the truck?");
        String strLength = scanner.nextLine();
        length = Integer.parseInt(strLength);
        
        //checking for a valid input
        if (length <= 0)  {
          throw new Exception("Invalid Input");
        } else  {
          valid = true;
        }
        
      } catch(Exception e) {
        valid = false;
      }
    } while (valid == false);
    
    //create the object for the second car
    Truck truck = new Truck(plate2, col2, doors2, maxSpeed2, wheels, length);
    
    //now seeing what the user wants to do with the cars
    do  {
      //ask the user what they want to do
      try {
        System.out.print("Enter 1 to modify bike. Enter 2 to modify truck. Enter 0 to exit: ");
        String userChoice = scanner.nextLine();
        
        //if the input is invalid, repeat
        if (userChoice.equals("1") != true && userChoice.equals("2") != true && userChoice.equals("0") != true)  {
          throw new Exception("Invalid Input");
        }
        
        //if the user chose bike
        if (userChoice.equals("1")) {
          //what do they want to do
          System.out.print("0 - Accelerate. 1 - Decelerate. 2 - Get speed. 3 - Get max speed. 4 - Change plates");
          String itemToEdit = scanner.nextLine();
          
          //figure out what needs to be changed
          if (itemToEdit.equals("0")) {
            //accelerate
            bike.accel();
          } else if (itemToEdit.equals("1")) {
            //slow down
            bike.brake();
          } else if (itemToEdit.equals("2"))  {
            //get the speed
            bike.getSpeed();
          } else if (itemToEdit.equals("3"))  {
            //get the max speed of the car
            bike.getMaxSpeed();
          } else if (itemToEdit.equals("4"))  {
            //change the plates
            bike.changePlates();
          } else  {
            throw new Exception("Invalid input");
          }
        } else if (userChoice.equals("2")) {
          //what do they want to do
          System.out.print("0 - Accelerate. 1 - Decelerate. 2 - Get speed. 3 - Get max speed. 4 - Change plates");
          String itemToEdit = scanner.nextLine();
          
          //figure out what needs to be changed
          if (itemToEdit.equals("0")) {
            //accelerate
            truck.accel();
          } else if (itemToEdit.equals("1")) {
            //slow down
            truck.brake();
          } else if (itemToEdit.equals("2"))  {
            //get the speed
            truck.getSpeed();
          } else if (itemToEdit.equals("3"))  {
            //get the max speed of the car
            truck.getMaxSpeed();
          } else if (itemToEdit.equals("4"))  {
            //change the plates
            truck.changePlates();
          } else  {
            throw new Exception("Invalid input");
          }
        }
      } catch(Exception e) {
        System.out.println("An input was invalid, try again");
      }
    } while (valid == false);
    
    //print the cars' data
    bike.print();
    truck.print();
  }
}