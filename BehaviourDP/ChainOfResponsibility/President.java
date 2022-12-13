package BehaviourDP.ChainOfResponsibility;

public class President extends LoanApprover {
    public void approveLoan(Loan loan) {
        // TODO Auto-generated method stub

        System.out.println("Loan approved by president of amount " + loan.amount);

    }

}
