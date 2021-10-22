
public class Account 
{
	private int accountNumber;
	private String acountType;
	private float balance;
	public Account(int accountNumber, String acountType, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.acountType = acountType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", acountType=" + acountType + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		return this.accountNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (this.accountNumber != other.accountNumber)
			return false;
		
		return true;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAcountType() {
		return acountType;
	}
	public void setAcountType(String acountType) {
		this.acountType = acountType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
}
