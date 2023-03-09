import java.util.ArrayList;
import java.util.Arrays;


public class Train {

    private final Engine engine;
    private ArrayList<Car> carsAttached;
    
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
            this.engine = new Engine(fuelType, fuelCapacity);
            this.carsAttached = new ArrayList<Car>(nCars);
            for(int i = 0; i < nCars; i++) {
            carsAttached.set(i, new Car(passengerCapacity));
            }
}
public Engine getEngine(){
    return this.engine;
}
public Car getCar(int i){
    return this.carsAttached.get(i);
}

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
