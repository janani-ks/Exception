package bankexception;

public class InsufficientFundsException extends Exception {
	   double amount; 
	   public InsufficientFundsException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
}