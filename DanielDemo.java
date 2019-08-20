class Vehicle implements Cloneable {
    public String type;
    public int wheels;
    
    public Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle)super.clone();
    }

    public void printVehicle() {
        System.out.printf("\nType: %s\n# of Wheels: %d\n", this.type, this.wheels);
    }
}

public class DanielDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle motorcycle1 = new Vehicle("Motorcycle", 2);
        Vehicle motorcycle2 = motorcycle1.clone();

        motorcycle1.printVehicle();
        motorcycle2.printVehicle();
    }
}