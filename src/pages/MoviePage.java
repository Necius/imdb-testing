package pages;

public class MoviePage extends BasePage {
	
	private String addToWatchList = "Add to watch list";
	private String rateIcon = "Rate Icon"; 
	private String currentRatingLabel = "Current rating label";
	private String currentNumberOfVotesLabel = "Current number of votes label";
	private String playTrailerButton = "Play trailer button";
	
	
	public void getAddToWatchList() {
		printMessage(addToWatchList);
	}
	public void getRateIcon() {
		printMessage(rateIcon);
	}
	public void getCurrentRatingLabel() {
		printMessage(currentRatingLabel);
	}
	public void getCurrentNumberOfVotesLabel() {
		printMessage(currentNumberOfVotesLabel);
	}
	public void getPlayTrailerButton() {
		printMessage(playTrailerButton);
	}
	
	
	

}
