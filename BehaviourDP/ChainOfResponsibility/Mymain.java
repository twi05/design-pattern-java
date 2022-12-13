package BehaviourDP.ChainOfResponsibility;

public class Mymain {
    public static void main(String[] args) {
        LoanApprover manager = new Manager();
        LoanApprover director = new Director();
        LoanApprover president = new President();
        LoanApprover manager2 = new Manager();

        manager.setNextApprover(manager2);
        manager2.setNextApprover(director);
        director.setNextApprover(president);
        manager.approveLoan(new Loan(5545456));
    }
}
