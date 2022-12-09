package Composite;

public class Developer implements Employee{
    String name;

    public Developer(String name){
        this.name = name;
    }
    
    public void getSalary(){
      System.out.println("Developer salary");  
    }

}
