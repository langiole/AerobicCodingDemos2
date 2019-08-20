import java.util.ArrayList;

interface GarageInterface {
    ArrayList<Car> cars = new ArrayList<Car>();
    
    public void addCar();
    public default int carCount() {
        return cars.size();
    }
}

class Car { }

class Garage implements GarageInterface {
    public void addCar() {
        cars.add(new Car());
    }
}

public class JustinDemo {

    public static void main(String[] args) {
        
        Garage g = new Garage();

        g.addCar();
        g.addCar();
        g.addCar();
        g.addCar();
        g.addCar();

        System.out.println("How many cars do I have in my garage?: " + g.carCount());
    }

}