package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] numberArray = new int[5];
        numberArray[0] = 9;
        numberArray[1] = 10;
        numberArray[2] = 2;
        numberArray[3] = 1;
        numberArray[4] = 5;

        System.out.println("Truoc khi sap xep: ");
        for (int number : numberArray) {
            System.out.println(number);
        }

        //sxep tang dan
        int temp = 0;
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] > numberArray[j]) {
                    temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sau khi sap xep: ");
        for (int number : numberArray) {
            System.out.println(number);
        }
        //sxep giam dan

    }
}
