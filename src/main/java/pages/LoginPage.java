package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static final By usernameInput = By.xpath("//input[@at-a-input-text=\"email-signin\"]");
    public static final By passwordInput = By.xpath("//input[@at-a-input-text=\"password-signin\"]");
    public static final By signInButton = By.xpath("//button[@at-a-button=\"reset-password\"]");

    public DashboardPage loginAs(String username, String password) {
        $(usernameInput).sendKeys(username);
        $(passwordInput).sendKeys(password);
        $(signInButton).click();
        return new DashboardPage();
    }

}
