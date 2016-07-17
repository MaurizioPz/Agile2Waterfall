package entities;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private ProjectConfig config;
	private List<UserStory> userStories = new ArrayList<UserStory>();	
	
	public Project(ProjectConfig config) {
		this.config = config;
	}

	public void add(UserStory us) {
		userStories.add(us);
	}

	public Plan getPlan() {
		Plan plan = new Plan();
		plan.storyPoints = userStories
				.stream()
				.mapToDouble(UserStory::getPoints)
				.sum();
		return plan;
	}
	
	
}
