
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User admin = new User("admin","123456");
		
		UserPanel up = new UserPanel();
		SignInPage si = new SignInPage(admin);
		SignUpPage su = new SignUpPage();
		SubscriptionPage sp = new SubscriptionPage(su);
		
		WelcomePage wp = new WelcomePage(si,sp);
		
		si.establishReferenceToWelcomePage(wp);
		si.establishReferenceToUserPanel(up);
		up.establishReferenceToSignInPage(si);
		sp.establishReferenceToWelcomePage(wp);
		su.establishReferenceToSubscriptionPage(sp);
		su.establishReferenceToWelcomePage(wp);
		
		
	}

}


//MEHMET UMUT ÝNCEER