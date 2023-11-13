package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int totalQuantity = Integer.parseInt(scanner.nextLine());
        int[] numberArray = new int[totalQuantity];
        for (int i = 0; i <= numberArray.length - 1; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " : ");
            numberArray[i] = Integer.parseInt(scanner.nextLine());
        }

        while (true) {
            displayMenu();
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    int sumAdd = 0;
                    for (int i = 0; i <= numberArray.length - 1; i++) {
                        sumAdd += numberArray[i];
                    }
                    System.out.println("Tong = " + sumAdd);
                    break;
                case 2:
                    int sumSub = numberArray[0];
                    for (int i = 1; i <= numberArray.length - 1; i++) {
                        sumSub -= numberArray[i];
                    }
                    System.out.println("Hieu = " + sumSub);
                    break;
                case 3:
                    int sumMulti = 1;
                    for (int number : numberArray) {
                        sumMulti *= number;
                    }
                    System.out.println("Tich = " + sumMulti);
                    break;
                case 4:
                    int sumDiv = 1;
                    for (int number : numberArray) {
                        sumDiv /= number;
                    }
                    System.out.println("Thuong = " + sumDiv);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long chon chuc nang tu 1- 4");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. Thuc hien phep cong");
        System.out.println("2. Thuc hien phep tru");
        System.out.println("3. Thuc hien phep nhan");
        System.out.println("4. Thuc hien phep chia");
        System.out.println("5. Thoat");
        System.out.print("Moi ban chon phep tinh:");
    }
}

