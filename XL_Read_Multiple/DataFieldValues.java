package XL_Read_Multiple;

public class DataFieldValues {
	
	String userName;
	String password;
	
	public String getUserName() {
		
			return userName;
		
	}
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		System.out.println("Username = "+this.userName);
	}
	
	public String getPassword() {
		
			return password;
			
	}
	
public void setPassword(String password) {
		
		this.password = password;
		System.out.println("Password = "+this.password);
		
	}
}
