package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WorkflowsPage {
    public static final By addNewWorkflowButton = By.xpath("//span[contains(text(),'New Workflow')]");
    public static final By timelineButton = By.xpath("//a[contains(text(),\"TIMELINE\")]");
    public static final By connectOptions = By.xpath("//ul[@data-type='CREATION']//ul/li");
    public static final By saveButton = By.xpath("//a[contains(text(),\"Save\")]");
    public static final By creationAddMarker = By.xpath("//ul[@data-type='CREATION']/li");
    public static final By workFlowCardList = By.xpath("//div[@class='workflow-card']//h3");


    public WorkflowsPage clickOnAddNewWorkflowButton() {
        $(addNewWorkflowButton).click();
        return this;
    }

    public WorkflowsPage clickOnTimelineButton() {
        $(timelineButton).click();
        return this;
    }

    public WorkflowsPage clickOnSaveButton() {
        $(saveButton).click();
        $(saveButton).shouldNotBe(Condition.visible);
        return this;
    }

    public WorkflowsPage addCallAndEmails() {
        $(creationAddMarker).hover();
        $$(connectOptions).shouldHaveSize(2);
        $$(connectOptions).first().click();
        $$(connectOptions).last().click();
        return this;
    }
}
