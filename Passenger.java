/** A class that contains a method that adds a Passenger to a specific Car and a method that removes a Passenger from a specific Car
 * @author Tajhini Brown
 */
public class Passenger extends Car{
/**
 * Contains a method that adds a Passenger to a specific Car and a method that removes a Passenger from a specific Car
 * @param name  The name of the passanger
 */
    
    private String name;
    /** Constructor*/
    public Passenger(String name) {
        super();
        this.name = name;
    }

    /**
     * Allows a passenger to get on a Car
     * @param c
     */
    public void boardCar(Car c){
        try{
            c.addPassenger(this);
        } catch (final Exception e) {
            System.err.println("This car is full.");
        }
    }

    /**
     * Allows a passenger to get off a Car
     * @param c
     */
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



}
