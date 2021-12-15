
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SignInPage si = new SignInPage();
		SignUpPage su = new SignUpPage();
		SubscriptionPage sp = new SubscriptionPage(su);
		
		WelcomePage wp = new WelcomePage(si,sp);
		
		si.establishReferenceToWelcomePage(wp);
		sp.establishReferenceToWelcomePage(wp);
		su.establishReferenceToSubscriptionPage(sp);
		
		
	}

}


//MEHMET UMUT ÝNCEER