package PrototypeDesign;

public class EmployeeRecord implements Prototype {
    private String name;
    private int id;

    public EmployeeRecord(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(name, id);
    }

    @Override
    public void showRecord() {
        // TODO Auto-generated method stub
        System.out.println("Name" + name + "  id" + id);

    }

}
