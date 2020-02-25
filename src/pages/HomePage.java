package pages;

public class HomePage extends BasePage {
	private String searchIcon = "Search icon";
	private String searchDropDown = "Search drop down";
	private String searchField = "Search field";
	private String signInButton = "Sign in button";
	private String watchList = "Watch List";
	
	public void getSearchIcon() {
		printMessage(searchIcon);
	}
	public void getSearchDropDown() {
		printMessage(searchDropDown);
	}
	public void getSearchField() {
		printMessage(searchField);
	}
	public void getSignInButton() {
		printMessage(signInButton);
	}
	public void getWatchList() {
		printMessage(watchList);
	}
	
	

}
