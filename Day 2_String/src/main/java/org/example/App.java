package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //split
        System.out.println("----------Demo Split with Array----------");
        String name = "Vu Van Tuyen hoc Java";
        String nameArray[] = name.split(" ");
        for (String o : nameArray) {
            System.out.println(o);
        }

        //StringBuilder with append, replace, delete, reverse, insert
        System.out.println("----------StringBuilder----------");
        String name1 = "Tuyen Vu";
        String name2 = " hoc Dai hoc FPT";
        StringBuilder builder = new StringBuilder("Vu Tuyen");
        builder.append(name2);
        System.out.println(builder);
        builder.replace(0, 8, "Xuan");
        System.out.println(builder);
    }
}
