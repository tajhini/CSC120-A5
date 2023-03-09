/** A class that contains a method that adds a Passenger to a specific Car and a method that removes a Passenger from a specific Car
 * @author Tajhini Brown
 */
public class Passenger extends Car{
/**
 * Contains a method that adds a Passenger to a specific Car and a method that removes a Passenger from a specific Car
 * @param String name, string
 * @return returns nothing
 */
    
    private String name;

    public Passenger(String name) {
        super();
        this.name = name;
    }

    public void boardCar(Car c){
        try{
            c.addPassenger(this);
        } catch (final Exception e) {
            System.err.println("This car is full.");
        }
    }

    public void getOffCar(Car c){
        try{
            c.removePassenger(this);
        } catch (final Exception e) {
            System.err.println(this + " is not in the car.");
        }
    }

    @Override
    public String toString() {
    return name ;
    }

    // public static void main(String[] args) {

    //     // Passenger p1 = new Passenger("Brad");
    //     // Passenger p2 = new Passenger("Sam");
    //     // Passenger p3 = new Passenger("Cat");
        
    //     // Car c1 = new Car(1);
    //     // Car c2 = new Car(3);

    //     // c1.addPassenger(p1);
    //     // c2.addPassenger(p2);
    //     // c2.addPassenger(p3);

    //     // c2.printManifest();

    //     // p2.getOffCar(c2);

    //     // c2.printManifest();

    // }

}
