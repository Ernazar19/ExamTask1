import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Car mers = new Car("Mercedes-Benz W124", LocalDate.of(1995, 11, 3), 7000, BodyType.SEDAN);
        System.out.println(mers);
        mers.bodyTypeIdentification();
        mers.dateOfMade(mers.getMadeOfDade());
        Car bmw = new Car("BMW X7", LocalDate.of(2021, 3, 23), 25000, BodyType.CROSSOVER);
        System.out.println(mers);
        bmw.bodyTypeIdentification();
        bmw.dateOfMade(bmw.getMadeOfDade());
    }

}