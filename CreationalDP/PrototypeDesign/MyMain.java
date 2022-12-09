package PrototypeDesign;

public class MyMain {

    public static void main(String[] args) {
        
        Prototype p1 = new EmployeeRecord("Twinshu", 2);
        EmployeeRecord e2 = (EmployeeRecord) p1.getClone();
        e2.showRecord();

        Prototype p2 = new StudentRecord("Anuj", 1);
        StudentRecord s1 = (StudentRecord) p2.getClone();
        s1.showRecord();
    }
}
