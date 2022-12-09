package Composite;

import java.util.ArrayList;

public class Assembly implements Employee {

    ArrayList<Employee> a= new ArrayList<Employee> ();

    public void add(Employee e){
        a.add(e);
    }
    public void remove(Employee e){
        a.remove(e);
    }



    @Override
    public void getSalary() {
        for (Employee employee : a) {
            employee.getSalary();
        }
    }

    
    
}
