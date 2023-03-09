import java.util.ArrayList;

public class Car{

    private  ArrayList<Passenger> passengerList;
    private int passengerCapacity;
    
    public Car(){

    }
    public Car(int passengerCapacity){
        this.passengerCapacity = passengerCapacity;
        passengerList = new ArrayList<Passenger>(passengerCapacity);
    }

    public int getCapacity(){
        return passengerCapacity;
    }

    public int seatsRemaining(){
        int seatsRemain = passengerCapacity - passengerList.size();
        return seatsRemain;
    }
    
    public void addPassenger(Passenger p){
        passengerList.add(p);
        if (seatsRemaining() ==passengerCapacity) {
            throw new RuntimeException("This car is full!");
          }
          System.out.println(p + " has been added.");
    }
    public void removePassenger(Passenger p){
        passengerList.remove(p); 
        
        if ( passengerList.contains(p)) {
            throw new RuntimeException("This passenger is not in the car!");
          }
          System.out.println(p+ " has been removed");
    }
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