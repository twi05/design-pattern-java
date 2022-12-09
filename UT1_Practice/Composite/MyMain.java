package Composite;

public class MyMain {
    public static void main(String[] args) {
        Developer d = new Developer("hello");
        Manager m = new Manager("manager");
        GeneralManager gm = new GeneralManager("genereal mananger");
        Assembly ass = new Assembly();
        Assembly ass2 = new Assembly();
        ass.add(d);
        ass.add(m);
        ass.add(gm);
        ass2.add(ass);
        ass2.getSalary();

    }
}
