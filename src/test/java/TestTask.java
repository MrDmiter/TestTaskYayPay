import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.LeftBarMenu;
import pages.LoginPage;
import pages.WorkflowsPage;

import static com.codeborne.selenide.Selenide.$$;


public class TestTask extends BaseTest {

    @Test
    public void workflowCreationTest() {
        LoginPage loginPage = Selenide.open("/", LoginPage.class);
        loginPage.loginAs("testTask@email.com", "Abc12345!");
        WorkflowsPage workflowsPage = at(LeftBarMenu.class).clickWorkflowsTab();
        int collectionSizeBeforeAddingNewWorkflow = $$(WorkflowsPage.workFlowCardList).size();
        workflowsPage.clickOnAddNewWorkflowButton()
                .clickOnTimelineButton()
                .addCallAndEmails()
                .clickOnSaveButton();
        at(LeftBarMenu.class).clickWorkflowsTab();
        $$(WorkflowsPage.workFlowCardList).shouldHaveSize(collectionSizeBeforeAddingNewWorkflow + 1);
    }
}
