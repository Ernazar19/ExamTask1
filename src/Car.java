import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Car implements MadeOfDate {
    private  String mark;
    private LocalDate madeOfDade;
    private int price;
    private BodyType bodyType;

    public Car(String mark, LocalDate madeOfDade, int price,BodyType bodyType) {
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
        if (bodyType.equals(BodyType.SEDAN)){
            System.out.println("Легковой классындагы машина");
        }else if (bodyType.equals(BodyType.CROSSOVER)){
            System.out.println("Внедорожник классындагы машина");
        } else if (bodyType.equals(BodyType.OFROADVERHICLE)) {
            System.out.println("Внедорожник классындагы машина");
        } else if (bodyType.equals(BodyType.UNIVERSAL)) {
            System.out.println("Универсал классындагы машина");
        } else if (bodyType.equals(BodyType.HATCHBACK)) {
            System.out.println("Легковой классындагы машина");

        }

    }


    @Override
    public void dateOfMade(LocalDate date) {
        Date date1 = new Date();
        System.out.println("Азыркы жыл\n"+date1);
        System.out.println("Год эксплуатации");
        System.out.println(Period.between(madeOfDade,LocalDate.now()).getYears()+"-Жыл");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", madeOfDade=" + madeOfDade +
                ", price=" + price +
                '}';
    }
}
