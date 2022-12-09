package BehaviourDP.StateDesignPattern;

public class AlertStateContext {
    MobileAlertState currentContext;

    public void setCurrentContext(MobileAlertState currentContext) {
        this.currentContext = currentContext;
    }

    public MobileAlertState getCurrentContext() {
        return currentContext;
    }

    public void  changeStateContext(MobileAlertState ctx)
    {
        this.currentContext = ctx;
    }

    public void alert(){
        currentContext.alert(this);
    }
}
