import entities.ProjectConfig;
import org.junit.*;

import static org.junit.Assert.*;


/**
 *
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 *
 */
public class ConfigurationTest {

    @Test
    public void ProjectConfig__HasDefaults() {
        ProjectConfig config = new ProjectConfig();
        assertEquals(15, config.safetyMargin);
        assertEquals(5, config.bugfixMargin);
        assertEquals(10, config.testMargin);
        assertEquals(15, config.projectManagement);
        assertEquals(3, config.numberOfTeamMembers);
        assertEquals(5, config.dailyMeetingsMinutesPerPerson);
        assertEquals(2, config.hoursToPlanSprint);
        assertEquals(8, config.hoursToDefineUseCases);
        assertEquals(8, config.hoursOfSprintMeetings);
        assertEquals(8, config.hoursToBuildPackage);
        assertEquals(8, config.hoursToInstall);
        assertEquals(4, config.hoursToUAT);
        assertEquals(20, config.capacity);
    }

    


}
