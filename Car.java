import java.sql.Array;
import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // constractor
    public Car( String make,
    double price,
    int year,
    String color, String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;
    }

    public double getPrice() {
        return  this.price;
    }

    public String[] getParts() {
        return this.parts;
    }

    public int getYear() {
        return this.year;
    }

    public void  setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public Car(Car source) {
        this.make = source.make;
        this.year = source.year;
        this.price = source.price;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public void drive() {
        System.out.println("you bought " + this.year + " " + this.color  + " " + this.make + " " + this.price);
    }

   public String toString() {
        return "Make: " + this.make + "parts " + Arrays.toString(this.parts) + " " + "color: " + color;
   }
}
