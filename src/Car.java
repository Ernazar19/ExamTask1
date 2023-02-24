import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Car implements MadeOfDate {
    private  String mark;
    private LocalDate madeOfDade;
    private int price;
    private BodyType bodyType;

    public Car(String mark, LocalDate madeOfDade, int price, BodyType bodyType) {
        this.mark = mark;
        this.madeOfDade = madeOfDade;
        this.price = price;
        this.bodyType = bodyType;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public LocalDate getMadeOfDade() {
        return madeOfDade;
    }
    public void setMadeOfDade(LocalDate madeOfDade) {
        this.madeOfDade = madeOfDade;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;

    }
    @Override
    public void bodyTypeIdentification() {
        switch (getBodyType()){
            case SEDAN -> System.out.println("Легковая машина ");
            case CROSSOVER -> System.out.println("Машина для городских и для горных езды ");
            case HATCHBACK -> System.out.println("легковая машина ");
            case UNIVERSAL -> System.out.println("легковая машина для ");
            case OFROADVERHICLE -> System.out.println("Машина для бездорожья ");
        }
    }

    @Override
    public void dateOfMade(LocalDate date) {
        System.out.println(Period.between(madeOfDade,LocalDate.now()).getYears());
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", madeOfDade=" + madeOfDade +
                ", price=" + price +
                ", bodyType=" + bodyType +
                '}';
    }
}
