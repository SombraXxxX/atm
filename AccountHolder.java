public class AccountHolder{
	private int Ssn;
	private String Name;
	private int Phone;
	private String Address;


public AccountHolder( int Ssn, String Name, int Phone, String Address) {
	this.Ssn = Ssn;
	this.Name = Name;
	this.Phone = Phone;
	this.Address = Address;
}
public int GetSsn() {
	return Ssn;
}
public String GetName() {
	return Name;
}
public int GetPhone() {
	return Phone;
}
public String GetAddress() {
	return Address;
}
public void setSsn(int Ssn) {
	this.Ssn = Ssn;
}
public void setName(String Name) {
	this.Name = Name;
}
public void setPhone(int Phone) {
	this.Phone = Phone;
}
public void setAddress(String Address) {
	this.Address = Address;
}
}