public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Motorbike("voiture", "marque", 80, "red");

        if( vehicle instanceof Car car ) {
//            Car car = (Car) vehicle;
            System.out.println("portes: "+car.getDoors());
        }
        else if( vehicle instanceof Motorbike moto ) {
            System.out.println("couleur: "+moto.getColor());
        }

        vehicle.move(10, true);




    }


}
