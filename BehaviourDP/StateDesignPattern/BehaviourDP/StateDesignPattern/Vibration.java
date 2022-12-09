package BehaviourDP.StateDesignPattern;
public class Vibration implements MobileAlertState{
    public void alert(AlertStateContext ctx) {
        System.out.println("Vibration Alert");
    }    
}
