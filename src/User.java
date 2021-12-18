
public class User {
	private String email,password,creditCardNumber,creditCardDate,creditCard3D, subscriptionModel;

	public User() {
		
	}
	
	public User(String adminEmail, String adminPassword) {
		this.email = adminEmail;
		this.password = adminPassword;
	}
	
	public String getSubscriptionModel() {
		return subscriptionModel;
	}

	public void setSubscriptionModel(String subscriptionModel) {
		this.subscriptionModel = subscriptionModel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws RuntimeException{
		if(email.length() != 0) {
			this.email = email;
		}
		else {
			throw new RuntimeException("Email field must not be left blank!");
		}
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws RuntimeException{
		if(password.length() != 0) {
			this.password = password;			
		}
		else {
			throw new RuntimeException("Password field must not be left blank!");
		}
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) throws RuntimeException{
		if(checkCreditCardNumberFormat(creditCardNumber)) {
			this.creditCardNumber = creditCardNumber;
		}
		else {
			throw new RuntimeException("Credit Card Number must be 16 digit positive number!");
		}
		
	}

	public String getCreditCardDate() {
		return creditCardDate;
	}

	public void setCreditCardDate(String creditCardDate) throws RuntimeException{
		if(checkCreditCardDateFormat(creditCardDate)){
			this.creditCardDate = creditCardDate;
		}
		else {
			throw new RuntimeException("Credit Card Date must be in MM/YY format and must not be expired. For example: 09/28 for December 2028");
		}
	}

	public String getCreditCard3D() {
		return creditCard3D;
	}

	public void setCreditCard3D(String creditCard3D) throws RuntimeException {
		if(checkCreditCard3DFormat(creditCard3D)) {
			this.creditCard3D = creditCard3D;
		}
		else {
			throw new RuntimeException("Credit Card Security Number (CVV) must be 3 digit positive number!");
		}
	}
	
	
	private boolean checkCreditCardNumberFormat(String ccNo) {
		if(ccNo.length()==16 && isPositiveNumber(ccNo))
		{
			return true;
		}
		return false;
	}
	
	private boolean checkCreditCardDateFormat(String ccDate) {
		int month,year;
		
		if(ccDate.indexOf("/") == 2) {
			String[] arr = ccDate.split("/",2);
			
			try {
				month = Integer.parseInt(arr[0]);
				year = Integer.parseInt(arr[1]);
				
			}
			catch(NumberFormatException nfe) {
				return false;
			}
			
			
			if((month > 0 && month < 13) && year > 21)
			{
				return true;
			}
		}
		return false;
	}

	private boolean checkCreditCard3DFormat(String cc3D) {
		if(cc3D.length()==3 && isPositiveNumber(cc3D))
		{
			return true;
		}
		return false;
	}
	
	
	private boolean isPositiveNumber(String x) {
		try {
			long val = Long.parseLong(x);
			if(val < 0)
			{
				return false;
			}
		}
		catch(NumberFormatException nfe) {
			return false;
		}
		
		return true;
	}
	
	public String getUserData() {
		return this.getEmail() + " " + this.getPassword() + " " + this.getCreditCardNumber() + " " + this.getCreditCardDate() + " " + this.getCreditCard3D() + " " + this.getSubscriptionModel();
	}
	
	public boolean isNotNull() {
		if(this.email != null && this.password != null && this.creditCardNumber != null && this.creditCardDate != null && this.creditCard3D != null) {
			return true;
		}
		
		return false;
	}
}