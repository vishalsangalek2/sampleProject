package Trial;

public class Encapsulation {
	
	private String bank_Name;
	private String Account_Holder;
	private double balance;
	private String Account_Number;
	
	
	public String getBank_Name() {
		return bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		this.bank_Name = bank_Name;
	}
	public String getAccount_Holder() {
		return Account_Holder;
	}
	public void setAccount_Holder(String account_Holder) {
		Account_Holder = account_Holder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		
		this.balance = balance;
	}
	public String getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		
		Account_Number = account_Number+"";
	}
	@Override
	public String toString() {
		return "Encapsulation [bank_Name=" + bank_Name + ", Account_Holder=" + Account_Holder + ", balance=" + balance
				+ ", Account_Number=" + Account_Number + "]";
	}
		public static void main(String[] args) {
		//	System.out.println(Account_Number+balance);
	}

}
