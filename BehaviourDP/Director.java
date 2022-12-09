package BehaviourDP;

public class Director extends LoanApprover {

    public void approveLoan(Loan loan) {
        // TODO Auto-generated method stub
        if(loan.amount > 10000000){
            this.nextApprover.approveLoan(loan);
        }
        else{
            System.out.println("Loan approved by director of amount " + loan.amount);
        }
    }
    
}
