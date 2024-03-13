public class Vehicle {

    private final String model;
    private final String brand;
    private int power;
    private int kmTravelled;

    public Vehicle(String model, String brand, int power, int kmTravelled) {
        this.model = model;
        this.brand = brand;
        this.power = power;
        this.kmTravelled = kmTravelled;
    }

    public Vehicle(String model, String brand, int power) {
        this(model, brand, power, 0);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if( power >= 0 ) {
            this.power = power;
        }
    }

    public int getKmTravelled() {
        return kmTravelled;
    }

    private void setKmTravelled(int kmTravelled) {
        if( kmTravelled < 0 ) {
            kmTravelled = 0;
        }

        this.kmTravelled = kmTravelled;
    }

    public void move(int distance){
        this.move(distance, true);
    }

    public void move(int distance, boolean forward) {
        if( distance < 0 ) {
            return;
        }

        if( !forward ){
            distance = -distance;
        }

        this.setKmTravelled( this.getKmTravelled() + distance );
    }
}
