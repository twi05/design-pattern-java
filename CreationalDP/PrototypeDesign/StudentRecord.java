package PrototypeDesign;

public class StudentRecord implements Prototype{
    private String name;
    private int id;

    public StudentRecord(String name, int id){
        this.id = id;
        this.name = name;
    }

    @Override
    public Prototype getClone() {
        // TODO Auto-generated method stub
        return new StudentRecord(name, id);
    }
    
    @Override
    public void showRecord() {
        // TODO Auto-generated method stub
        System.out.println("Name:" + name + "  id: " + id);
    }
}