
public class Customer {
	private String mobileno;
	private String address;
	private int pincode;
	private String accountHolderName;
	public Customer(String mobileno, String address, int pincode, String accountHolderName) {
		super();
		this.mobileno = mobileno;
		this.address = address;
		this.pincode = pincode;
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Customer [mobileno=" + mobileno + ", address=" + address + ", pincode=" + pincode
				+ ", accountHolderName=" + accountHolderName + "]";
	}
	
	

}
