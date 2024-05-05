package runners;

import com.intuit.karate.junit5.Karate;

public class AdministratorWorkflowTestRunner {
    @Karate.Test
    Karate testAdministratorWorkflow() {
        return Karate.run("../features/administrator-workflow").relativeTo(getClass());
    }
}
