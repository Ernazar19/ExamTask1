import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes-Benz W124", LocalDate.of(1995, 11, 3), 7000,BodyType.SEDAN);
        Car car2 = new Car("BMW X7", LocalDate.of(2021, 3, 23), 25000,BodyType.CROSSOVER);
        Car car3 = new Car("Jeep",LocalDate.of(2018,1,13),16000,BodyType.OFROADVERHICLE);
        Car car4 = new Car("Audi",LocalDate.of(2018,6,24),16000,BodyType.UNIVERSAL);
        Car car5 = new Car("Subaru",LocalDate.of(2006,3,14),16000,BodyType.HATCHBACK);
        Car[]cars ={car1,car2,car3,car4,car5};
        for (Car car:cars) {
            System.out.println(car);
            car.bodyTypeIdentification();
            car.dateOfMade(car.getMadeOfDade());
        }
    }
}