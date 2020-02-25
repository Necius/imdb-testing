package pages;

public class SignInPage extends BasePage {
	
	private String signInWithImdbButton = "Sign in with imdb button";
	private String signInWithAmazonButton = "Sign in with Amazon";
	private String signInWithFacebookButton = "Sign in with Facebook";
	private String signInWithGoogleButton = "Sign in with Google";
	private String createAccountButton = "Create account button";
	
	
	public void getSignInWithImdbButton() {
		printMessage(signInWithImdbButton);
	}
	public void getSignInWithAmazonButton() {
		printMessage(signInWithAmazonButton);
	}
	public void getSignInWithFacebookButton() {
		printMessage(signInWithFacebookButton);
	}
	public void getSignInWithGoogleButton() {
		printMessage(signInWithGoogleButton);
	}
	public void getCreateAccountButton() {
		printMessage(createAccountButton);
	}
	
	

}
