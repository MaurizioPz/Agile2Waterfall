import entities.Plan;
import entities.Project;
import entities.ProjectConfig;
import entities.UserStory;
import entities.UserStoryEstimation;

import org.junit.*;

import static org.junit.Assert.*;


/**
 *
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 *
 */
public class ProjectTest {

    @Test
    public void GetPlan__SingleUserStory() {
        ProjectConfig config = new ProjectConfig();
        Project project = new Project(config);
        UserStory us = new UserStory("Title", 10);
        
        project.add(us);
        
        Plan plan = project.getPlan();
        assertNotNull(plan);
        assertEquals(10, plan.storyPoints, 0.01);
    }
    @Test
    public void GetPlan__MultipleUserStorie() {
        ProjectConfig config = new ProjectConfig();
        Project project = new Project(config);
        UserStory us = new UserStory("First", 10);
        project.add(us);
        UserStory us2 = new UserStory("Second", 5);
        project.add(us2);
        Plan plan = project.getPlan();
        assertNotNull(plan);
        assertEquals(15, plan.storyPoints, 0.01);
    }

    


}
