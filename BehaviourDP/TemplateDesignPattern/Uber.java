package BehaviourDP.TemplateDesignPattern;

import java.util.Scanner;

public class Uber extends Booking {

    String source;
    String dest;
    
    Scanner sc = new Scanner(System.in);
    @Override
    public void source() {
        // TODO Auto-generated method stub
        System.out.println("Enter the source: ");
        source = sc.nextLine();
        System.out.println("Going from "+source);
        
    }

    @Override
    public void dest() {
        System.out.println("Enter the destination: ");
        dest = sc.nextLine();
        System.out.println(" to "+dest);
        
    }

    @Override
    protected void payment() {
        System.out.println("uber payment called: 8rs/km");
    }

    @Override
    public void Welcome() {
        // TODO Auto-generated method stub
        super.Welcome();
        System.out.println("UBERRRRRRRR");
    }
    
}
