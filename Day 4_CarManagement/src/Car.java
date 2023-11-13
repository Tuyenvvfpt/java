import java.util.Arrays;

public class Car {
    private String brand;
    private String nameCar;
    private String color;
    private int price;
    private OptionInfor[] optionInfors;

    public Car() {
    }

    public OptionInfor[] getOptionInfors() {
        return optionInfors;
    }

    public void setOptionInfors(OptionInfor[] optionInfors) {
        this.optionInfors = optionInfors;
    }

    public Car(String brand, String nameCar, String color, int price) {
        this.brand = brand;
        this.nameCar = nameCar;
        this.color = color;
        this.price = price;
    }

    public Car(String brand, String nameCar, String color, int price, OptionInfor[] optionInfors) {
        this.brand = brand;
        this.nameCar = nameCar;
        this.color = color;
        this.price = price;
        this.optionInfors = optionInfors;
    }

    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", name='" + nameCar + '\'' + ", color='" + color + '\'' + ", price=" + price
                + ", optionInfors=" + Arrays.toString(optionInfors) + '}';
    }

    public void showInfor() {
        System.out.println("Thong tin cua xe: ");
        System.out.println(this.brand);
        System.out.println(this.nameCar);
        System.out.println(this.color);
        System.out.println(this.price);
    }
}

