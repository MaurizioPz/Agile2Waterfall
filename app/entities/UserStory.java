package entities;

public class UserStory {

	private String title;
	private double points;
	
	public UserStory(String title, double points) {
		this.title = title;
		this.points = points;
	}
	
	public double getPoints() {
		return points;
	}
	
	public String getTitle() {
		return title;
	}
}
