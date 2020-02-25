package pages;

public class CreateAccountPage extends BasePage {
	
	private String nameField = "Name Field";
	private String emailField = "Email field";
	private String passwordFiled = "Password field";
	private String repeatPassword = "Repeat password";
	private String createAccountButton = "Create account button";
	
	public void getNameField() {
		printMessage(nameField);
	}
	public void getEmailField() {
		printMessage(emailField);
	}
	public void getPasswordFiled() {
		printMessage(passwordFiled);
	}
	public void getRepeatPassword() {
		printMessage(repeatPassword);
	}
	public void getCreateAccountButton() {
		printMessage(createAccountButton);
	}
	
	

}
