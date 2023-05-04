import java.util.ArrayList;
import java.util.Arrays;

/** 
 * A class that contain methods that finds number of seats remaining on the entire train and the max capacity of the train as well
 * as print all the passengers on the train
 * @author Tajhini Brown
 */

public class Train {
/**
 * Contain methods that finds number of seats remaining on the entire train and the max capacity of the train as well
 * as prints all the passengers on the train
 * @param engine The type of engine the train (specific fuelType and fuelLevel)
 * @param carsAttached: The number of cars attached on the train
 */

private final Engine engine;
private ArrayList<Car> carsAttached;

/** Constructor */ 
public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
    this.engine = new Engine(fuelType, fuelCapacity);
    this.carsAttached = new ArrayList<Car>(nCars);
    for(int i = 0; i < nCars; i++) {
    carsAttached.set(i, new Car(passengerCapacity));
    }
}

/** Accessors*/ 
public Engine getEngine(){
    return this.engine;
}
public Car getCar(int i){
    return this.carsAttached.get(i);
}

/**
 * Gets the maximum capacity of the entire train
 * @return sum: The total number of passsengers that can fit on the train
 * */ 
public int getMaxCapacity(){
    int[] maxCap= {};
    int carsAttached_range = this.carsAttached.size();
    for (int b = 0; b < carsAttached_range; ++b){
        Car theCar = this.carsAttached.get(b);
        int carCap = theCar.getCapacity();
    maxCap = Arrays.copyOf(maxCap, maxCap.length + 1);
    maxCap[maxCap.length - 1] = carCap;
      }

      int sum = 0;
      for(int x : maxCap)
          sum += x;
      return sum;
}

/**
 * Gets the number of seats remaining on the train
 * @return sum  The total number of seats that are remaining on the train in all the Cars
 * */ 
public int seatsRemaining(){
    int[] seatCap= {};
    int carsAttached_range = carsAttached.size();
    for (int y = 0; y < carsAttached_range; ++y){
        Car theCar = this.carsAttached.get(y);
        int carCap = theCar.seatsRemaining();
    seatCap = Arrays.copyOf(seatCap, seatCap.length + 1);
    seatCap[seatCap.length - 1] = carCap;
      }

      int sum = 0;
      for(int x : seatCap)
          sum += x;
      return sum;

}

/**
 * Prints the passengers that are on the train
 */
public void printManifest(){
    int carsAttached_range = carsAttached.size();
    for (int z = 0; z < carsAttached_range; ++z){
      Car theCar = carsAttached.get(z);
      theCar.printManifest();
    }
}

public static void main(String[] args) {
    Passenger p1 = new Passenger("Brad");
    Passenger p2 = new Passenger("Sam");
    Passenger p3 = new Passenger("Cat");
    
    Car c1 = new Car(1);
    Car c2 = new Car(3);

    c1.addPassenger(p1);
    c2.addPassenger(p2);
    c2.addPassenger(p3);

    p2.getOffCar(c2);

    Train train1 = new Train(FuelType.ELECTRIC, 10.5, 2, 5);
    System.out.println(train1.getMaxCapacity());
  

}
}
