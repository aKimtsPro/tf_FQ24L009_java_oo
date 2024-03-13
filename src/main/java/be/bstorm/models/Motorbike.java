public class Motorbike extends Vehicle {

    private String color;

    public Motorbike(String model, String brand, int power, String color){
        super( model, brand, power );
        this.color = color;
    }

    @Override
    public void move(int distance, boolean forward){
        super.move(distance, forward);
        System.out.println("Vroom");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

