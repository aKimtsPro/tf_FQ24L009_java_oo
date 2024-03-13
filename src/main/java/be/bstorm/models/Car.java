public class Car extends Vehicle {
    private final int doors;


    public Car( String model, String brand, int power ){
        super(model, brand, power);
        this.doors = 3;
    }

    public int getDoors() {
        return doors;
    }

}
