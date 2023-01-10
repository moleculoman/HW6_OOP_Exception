import Transport_pack.*;
import Transport_pack.driver.Driver_B;
import Transport_pack.driver.Driver_C;
import Transport_pack.driver.Driver_D;

public class Main {
    public static void main(String[] args) {


        Passenger_car ford = new Passenger_car("Ford", "Escape", 3.0,TypeOfBody.SEDAN);
        Passenger_car bmw = new Passenger_car("BMW", "3", 1.8,TypeOfBody.COUPE);
        Passenger_car toyota = new Passenger_car("Toyota", "Corolla", 1.6,TypeOfBody.HATCHBACK);
        Passenger_car nissan = new Passenger_car("Nissan", "Murrano", 3.5,TypeOfBody.CROSSOVER);

        Cargo_car man = new Cargo_car("MAN", "TGX", 10.5,Weight.N1);
        Cargo_car scania = new Cargo_car("SCANIA", "R-Series", 12,Weight.N2);
        Cargo_car renault = new Cargo_car("Renault", "Magnum", 12.8,Weight.N3);
        Cargo_car kenworth = new Cargo_car("KENWORTH", "T800", 11.0,Weight.N1);

        Bus volkswagen = new Bus("Volkswagen", "Crafter", 2.0,Capacity.SMALL);
        Bus fiat = new Bus("Fiat", "Ducato", 2.3,Capacity.EXTRA_SMALL);
        Bus iveco = new Bus("Iveco", "Daily", 3.0,Capacity.EXTRA_LARGE);
        Bus peugeot = new Bus("Peugeot", "Boxer", 2.2,Capacity.MIDDLE);



        Bus<Driver_D> anna1 = new Bus<>("Volkswagen", "Crafter", 2.0,Capacity.EXTRA_SMALL);
        Cargo_car<Driver_C> pavel1 = new Cargo_car<>("MAN", "TGX", 10.5,Weight.N1);
        Passenger_car<Driver_B> alex1 = new Passenger_car<>("Nissan", "Murrano", 3.5,TypeOfBody.CROSSOVER );

        System.out.println(anna1.toString());
        System.out.println(pavel1.toString());
        System.out.println(alex1.toString());
    }
}