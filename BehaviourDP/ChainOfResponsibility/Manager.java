package BehaviourDP.ChainOfResponsibility;

public class Manager extends LoanApprover{

    @Override
    public void approveLoan(Loan loan) {
        // TODO Auto-generated method stub
        if(loan.amount > 5000000){
            this.nextApprover.approveLoan(loan);
        }
        else{
            System.out.println("Loan approved by manager of amount " + loan.amount);
        }
    }

    
}
