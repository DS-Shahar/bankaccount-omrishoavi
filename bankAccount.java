package cyber;

public class BankAccount {

	private int balance;
	private int minBalance;
	private String owner;

	/*Accepts only balance above minBalance*/
	public BankAccount(int balance,int minBalance, String owner) {
		this.owner = owner;
		this.minBalance = minBalance;
		if (balance > minBalance) {
			this.balance = balance;
		}   
	}

	public int getBalance() {
		return balance;
	}

	/*Accepts only balance above minBalance*/
	public void setBalance(int balance) {
		if (balance > minBalance) {
			this.balance = balance;
		}
	}

	public String balanceToString() {
        return "Current Balance of " + owner + ": " + balance;
    }
	
	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	
	public String minBalanceToString() {
		return "Minimum Balance: " + minBalance;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}


	
	
	public boolean withdraw(int amount) {
		if (balance - amount < minBalance)
			return false;
		balance = balance - amount;
		return true;
	}
	public void deposit(int amount) {
		balance += amount;

	}

	public String transfer(BankAccount target, int amount) {
		if (this.withdraw(amount) == true) {
			target.deposit(amount);
			return "Transfer was successful";
		}
		else {
			return "Transfer failed: there wasnt enough money in " + this.owner + "'s bank account";
		}
	}

	

}
