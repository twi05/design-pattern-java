package BehaviourDP.StateDesignPattern;

public class MobileProduct {
    public static void main(String[] args) {
        AlertStateContext a = new AlertStateContext();
        MobileAlertState vib = new Vibration();
        a.setCurrentContext(vib);
        a.changeStateContext(new Silent());
        a.alert();
    }

}
