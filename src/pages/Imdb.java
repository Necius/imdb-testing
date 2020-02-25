package pages;

public class Imdb {
	
		private HomePage homePage;
		private CreateAccountPage createAccountPage;
		private MoviePage moviePage;
		private SignInPage signInPage;
		
		public HomePage gethomePage () {
			if (homePage == null) {
				homePage = new HomePage();
			}
			return homePage;
		}

		public CreateAccountPage getcreateAccountPage () {
			if (createAccountPage == null) {
				createAccountPage = new CreateAccountPage();
			}
			return createAccountPage;
		}
		public MoviePage getmoviePage () {
			if (moviePage == null) {
				moviePage = new MoviePage();
			}
			return moviePage;
		}
		public SignInPage getsignInPage () {
			if (signInPage == null) {
				signInPage = new SignInPage();
			}
			return signInPage;
		}
		
}
