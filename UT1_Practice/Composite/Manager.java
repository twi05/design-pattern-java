package Composite;

public class Manager implements Employee {

    String name;
    public Manager(String name) {
        this.name = name;
}

    @Override
    public void getSalary() {
                System.out.println("Manager : 50k");
    }

    
}
