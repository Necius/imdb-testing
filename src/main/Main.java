package main;

import pages.HomePage;
import pages.Imdb;

public class Main {

	public static void main(String[] args) {
//		HomePage homePage = new HomePage();
//		homePage.getSignInButton();
		Imdb imdb = new Imdb();
		imdb.gethomePage().getSignInButton();
		
		

	}

}
