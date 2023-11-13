package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int[6];
        numArr[0] = 9;
        numArr[1] = 5;
        numArr[2] = 7;
        numArr[4] = 4;

        System.out.print("Nhap so luong phan tu: ");
        int totalNumber = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[totalNumber];

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Nhap vao phan tu tai vi tri " + (i + 1) + " : ");
            numberArray[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = numberArray[0];
        for (int number : numberArray) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Phan tu nho nhat la: " + min);

        int max = numberArray[0];
        for (int number : numberArray) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Phan tu lon nhat la: " + max);
        System.out.println("--------------------------");
        int sum = 0;
        for (int num : numberArray) {
            sum += num;
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Tong la: " + sum);


        // for - loop
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.println(numArr[i]);
//        }
//        System.out.println("--------------------------");
//        for (int num : numArr) {
//            System.out.println(num);
//        }
    }
    //Create Menu
    /**
     *
     *   public static void main(String[] args) {
     *         displayMenu();
     *         Scanner scanner = new Scanner(System.in);
     *         while (true) {
     *             int select = Integer.parseInt(scanner.nextLine());
     *
     *             switch (select) {
     *                 case 1:
     *                     System.out.println("Ban da chon chuc nang 1.");
     *                     break;
     *                 case 2:
     *                     System.out.println("Ban da chon chuc nang 2");
     *                     break;
     *                 case 3:
     *                     System.out.println("Ban da chon chuc nang 3.");
     *                     break;
     *                 case 4:
     *                     System.out.println("Ban da chon chuc nang 4.");
     *                     break;
     *                 case 5:
     *                     System.exit(0);
     *                     break;
     *                 default:
     *                     System.out.println("Vui long chon chuc nang tu 1- 4");
     *                     break;
     *             }
     *         }
     *     }
     *
     *     private static void displayMenu() {
     *         System.out.println("1. Them moi sinh vien");
     *         System.out.println("2. Tim kiem sinh vien");
     *         System.out.println("3. Xoa sinh vien");
     *         System.out.println("4. Thong ke sinh vien");
     *         System.out.println("5. Thoat");
     *         System.out.println("Moi ban chon chuc nang:");
     *     }
     */
}
