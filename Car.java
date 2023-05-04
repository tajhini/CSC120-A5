import java.util.ArrayList;

/** 
 * This class represents train cars. It has methods that get the passanger
 * capacity, the number of seats remaining in the Car, add a passenger to the car, 
 * remove a passanger from the car and print the passenger manifest.
  
*/

public class Car{

     /**
      *Class attributes 
      * passengerList: An arraylist of the passengers in a Car
        passengerCapacity: The number of people that can fit in a Car
     */
    private  ArrayList<Passenger> passengerList;
    private int passengerCapacity;

  /**
   * Creates a Car class
   * @param passengerList An arraylist of the passengers in a Car
   * @param passengerCapacity The number of people that can fit in a Car
   */
    
    public Car(){

    }

    /** Accessors*/
    public int getCapacity(){
        return passengerCapacity;
    }

    public int seatsRemaining(){
        int seatsRemain = passengerCapacity - passengerList.size();
        return seatsRemain;
    }

    /** Constructor*/
    public Car(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
        passengerList = new ArrayList<Passenger>(passengerCapacity);
    }
    
    /**
     * Adds a passenger to the car
     * @param p A passenger object
    */
    public void addPassenger(Passenger p){
        
        if (seatsRemaining() ==passengerCapacity) {
            throw new RuntimeException("This car is full!");
          } 
        if (passengerList.contains(p)){
            throw new RuntimeException("This passenger is already in the car.");
        }
        if (seatsRemaining() != passengerCapacity && !passengerList.contains(p)){
            System.out.println(p + " has been added.");
        }         
    }

    /**
     * Removes a passenger from the car
     * @param p A passenger object
    */
    public void removePassenger(Passenger p){
        passengerList.remove(p); 
        
        if ( passengerList.contains(p)) {
            throw new RuntimeException("This passenger is not in the car!");
          }
          System.out.println(p+ " has been removed");
    }
    /**
     * Prints the passengers that are in the car
    */
    public void printManifest(){
        int numOfpass = passengerList.size();

        if (numOfpass == 0){
            System.out.println("This car is EMPTY!");
        }else{
            System.out.println("*****"+ " Passenger Manifest " + "*****");
            for (Passenger x : passengerList){
                System.out.println(x);
            }
        }
    }
}