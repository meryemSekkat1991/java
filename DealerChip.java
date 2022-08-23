import java.util.Arrays;

public class DealerChip {
    private  Car[] cars;

    public DealerChip(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length ; i++) {
            this.cars[i] = new Car((cars[i]));
        }
    }

    public void setCars(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
      return new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    public String  search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i] == null) {
                continue;
            }
           else if(this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget){
               return "found one" + cars[i].toString();
           }
        }
        return "sorry";
    }

    @Override
    public String toString() {
        return "DealerChip{" +
                "cars=" + Arrays.toString(cars) +
                '}';
    }
}
