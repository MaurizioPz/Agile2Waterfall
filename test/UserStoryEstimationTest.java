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
public class UserStoryEstimationTest {

    @Test
    public void UserStory__Planning() {
        ProjectConfig config = new ProjectConfig();
        UserStory us = new UserStory("Title", 10);
        UserStoryEstimation estimation = new UserStoryEstimation(us,config);
        
        assertEquals(1.5, estimation.safetyMargin(), 0.01);
        assertEquals(1, estimation.testMargin(), 0.01);
        assertEquals(0.5, estimation.bugFixingMargin(), 0.01);
        assertEquals(1.5, estimation.projectManagement(), 0.01);
        
        assertEquals(1.17, estimation.dailyMeetings(), 0.01);
        assertEquals(13.67, estimation.plan(), 0.01);
    
    }
    

    


}
