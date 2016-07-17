package entities;

public class ProjectConfig {

	public int safetyMargin;
	public int bugfixMargin;
	public int testMargin;
	public int projectManagement;

	public int numberOfTeamMembers;
	public int dailyMeetingsMinutesPerPerson;

	public int hoursToPlanSprint;
	public int hoursToDefineUseCases;
	public int hoursOfSprintMeetings;
	
	public int hoursToBuildPackage;
	public int hoursToInstall;
	public int hoursToUAT;
	
	public int capacity;
	
	public ProjectConfig() {
		this.safetyMargin = 15;
		this.bugfixMargin = 5;
		this.testMargin = 10;
		this.projectManagement = 15;
		this.numberOfTeamMembers = 3;
		this.dailyMeetingsMinutesPerPerson = 5;
		this.hoursToPlanSprint = 2;
		this.hoursToDefineUseCases = 8;
		this.hoursOfSprintMeetings = 8;
		this.hoursToBuildPackage = 8;
		this.hoursToInstall = 8;
		this.hoursToUAT = 4;
		this.capacity = 20;
	}

}
