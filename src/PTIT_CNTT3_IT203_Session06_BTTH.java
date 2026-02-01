public class PTIT_CNTT3_IT203_Session06_BTTH {
	static class BankAccount {
		private String accountNumber;
		private String ownerName;
		private double balance;

		public BankAccount() {
			this.accountNumber = "UNKNOWN";
			this.ownerName = "NO NAME";
			this.balance = 0;
		}

		public BankAccount(String accountNumber, String ownerName, double balance) {
			this.accountNumber = accountNumber;
			this.ownerName = ownerName;
			setBalance(balance);
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			if (balance >= 0) {
				this.balance = balance;
			} else {
				System.out.println("Balance must be non-negative");
			}
		}

		public void deposit(double amount) {
			if (amount > 0) {
				balance += amount;
			} else {
				System.out.println("Deposit amount is invalid");
			}
		}

		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance -= amount;
			} else {
				System.out.println("Withdraw failed");
			}
		}

		public void displayInfo() {
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Owner Name: " + ownerName);
			System.out.println("Balance: " + balance);
			System.out.println("-----------------------");
		}
	}

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount("AC001", "Nguyen Van A", 5000);
		BankAccount acc2 = new BankAccount();

		acc1.deposit(2000);
		acc1.withdraw(1000);

		acc2.setAccountNumber("AC002");
		acc2.setOwnerName("Tran Thi B");
		acc2.deposit(3000);
		acc2.withdraw(500);

		acc1.displayInfo();
		acc2.displayInfo();
	}
}
