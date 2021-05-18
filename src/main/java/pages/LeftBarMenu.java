package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class LeftBarMenu {

    public final static By workflowsTab = By.xpath("//p[contains(text(),'Workflows')]");
    public final static By collectionWorkflowList = By.xpath("//div[@class='collection-workflows-list']");

    public WorkflowsPage clickWorkflowsTab() {
        $(workflowsTab).click();
        $(collectionWorkflowList).shouldBe(Condition.visible, Duration.ofSeconds(30));
        return new WorkflowsPage();
    }

}
