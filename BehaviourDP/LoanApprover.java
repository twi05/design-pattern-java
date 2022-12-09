package BehaviourDP;

public abstract class LoanApprover {
   LoanApprover nextApprover;
   
   public void setNextApprover(LoanApprover approver){
        this.nextApprover = approver;
   }

   public abstract void approveLoan(Loan loan);
   
}
