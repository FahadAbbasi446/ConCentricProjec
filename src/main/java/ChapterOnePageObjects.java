import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ChapterOnePageObjects {
    private By leftDiv = By.id("divontheleft");
    private String textToVerifyInLeftDiv = "Assert that this text is on the page";
    private By homePageLink = By.linkText("Home Page");

    public void verifyText() {
        try {
            $(leftDiv).shouldHave(text(textToVerifyInLeftDiv));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void clickOnHomePageLink() {
        try {
            $(homePageLink).click();
        } catch (Exception e) {
            Assert.fail("Unable to click on home page link.");
        }
    }
}
