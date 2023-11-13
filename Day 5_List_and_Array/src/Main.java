import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //the first
        List<Integer> list = new ArrayList<>();
        System.out.println("Array now is empty: " + list.isEmpty());
        list.add(10);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(9);
        System.out.println("Truoc khi sxep: ");
        //listAll
        for (int item : list) {
            System.out.println(item);
        }
        System.out.println("");

        System.out.println("Sau khi sxep: ");
        //sort
        Collections.sort(list);
        for (int item : list) {
            System.out.println(item);
        }
        System.out.println("Sxep nguoc lai: ");
        //reverse
        Collections.reverse(list);
        for (int item : list) {
            System.out.println(item);
        }
    }
}