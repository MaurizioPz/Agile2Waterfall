package entities;

public class UserStoryEstimation {

	
	private UserStory userStory;
	private ProjectConfig projectConfig;

	public UserStoryEstimation(UserStory userStory, ProjectConfig projectConfig) {
		this.userStory = userStory;
		this.projectConfig = projectConfig;
	}

	public double safetyMargin() {
		return calculateMargin(projectConfig.safetyMargin);
	}

	public double testMargin() {
		return calculateMargin(projectConfig.testMargin);
	}
	
	public double bugFixingMargin() {
		return calculateMargin(projectConfig.bugfixMargin);
	}
	
	public double projectManagement() {
		return calculateMargin(projectConfig.projectManagement);
	}
	
	public double dailyMeetings() {
		double points = userStory.getPoints() + safetyMargin() + testMargin(); 
		double minutesPerPoint = projectConfig.dailyMeetingsMinutesPerPerson * projectConfig.numberOfTeamMembers * projectConfig.numberOfTeamMembers;
		double minutes = points * minutesPerPoint;
		return minutes / (8*60);
	}
	
	public double plan() {
		return userStory.getPoints() + safetyMargin() + testMargin() + dailyMeetings();
	}
	private double calculateMargin(int percent) {
		return userStory.getPoints() * percent / 100.0;
	}
	
}

