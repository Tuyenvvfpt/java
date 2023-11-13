import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        //Day 5
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(4);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("list at " + (i + 1) + " = " + list.get(i));
//        }
//        System.out.println("--------------");
//        list.remove(2);
//        for (int num : list) {
//            System.out.println("after delete: " + num);
//        }
////        list.stream().forEach(integer -> System.out.println(integer.toString()));
////        System.out.println(list.contains(20));
//        System.out.println("----------------------------------");
//        int[] arrayNumber = new int[5];
//        arrayNumber[0] = 5;
//        arrayNumber[1] = 2;
//        arrayNumber[2] = 4;
//        arrayNumber[3] = 1;
//        arrayNumber[4] = 3;
//        for (int i = 0; i < arrayNumber.length; i++) {
//            System.out.println("array list at " + (i + 1) + " = " + arrayNumber[i]);
//        }


        //Day 4
        Car car1 = new Car("Toyota", "Innova", "Black", 1000000);
        car1.showInfor();
        System.out.println("Car 1 Name: " + car1.getNameCar());
        System.out.println("----------------------------------");
        System.out.println("Car 1 Infor: " + car1.toString());

        //OBJECT WITH ARRAY
        Car car2 = new Car();
        car2.setBrand("Huyndai");
        car2.setNameCar("Tucson");
        car2.setColor("Red");
        car2.setPrice(2000000);
        //CHU Y
        //tao ra 3 option cho object
        OptionInfor[] optionInfor = new OptionInfor[3];
        for (int i = 0; i < optionInfor.length; i++) {

            Date date = new Date();

            OptionInfor option = new OptionInfor();
            option.setCreate(date);
            option.setAddressProduct("Viet Nam");
            System.out.println("Enter amount: ");
            option.setAmount(Integer.parseInt(scanner.nextLine()));
            //gán dữ liệu vào cho object
            optionInfor[i] = option;
        }
        car2.setOptionInfors(optionInfor);
        System.out.println("Car 2 Infor: " + car2.toString());

        //So sanh 2 Car
        System.out.println("Compare Car:");
        for (int i = 0; i < car2.getOptionInfors().length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (car2.getOptionInfors()[i].getAmount() < car2.getOptionInfors()[j].getAmount()) {
                    //biến tạm phải là một đối tượng
                    OptionInfor temp = new OptionInfor();
                    temp = car2.getOptionInfors()[i];
                    car2.getOptionInfors()[i] = car2.getOptionInfors()[j];
                    car2.getOptionInfors()[j] = temp;
                }
            }
        }
        System.out.println(car2.toString());
        //
    }
}