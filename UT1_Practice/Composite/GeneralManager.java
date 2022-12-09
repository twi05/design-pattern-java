package Composite;

public class GeneralManager implements Employee {

   public String name;

    public GeneralManager(String name) {
        this.name = name;
}

    @Override
    public void getSalary() {
                System.out.println("General Manager : 50k");
    }

    
}
