package BehaviourDP.TemplateDesignPattern;

/**
 * Booking
 */
public abstract class Booking {

    public void Welcome(){
        System.out.println("Welcome to Booking App"); //hook1
    }

    public void login(){
        System.out.println("User Logged in...");
    }
    public abstract void source();
    public abstract void dest();
    protected abstract void payment();

    public void operation(){
        Welcome();
        login();
        source();
        dest();
        payment();
        System.out.println("Operation executed successfully....");
    }

}