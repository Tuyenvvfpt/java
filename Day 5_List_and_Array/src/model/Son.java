package model;

public class Son extends Father {
    private String name2;


    public Son() {
    }

    public Son(String name, String name2) {
        super(name);
        this.name2 = name2;
    }
    private void showInfor(){
        System.out.println("cha");
    }
}
