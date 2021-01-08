import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePageObjects {
    public By chapterOneLink = By.linkText("Chapter1");

    public void openURL(String url) {
        if (url.isEmpty()) {
            Assert.fail("URL is not valid.");
        }
        try {
            open(url);
        } catch (Exception e) {
            Assert.fail("Unable to open provided URL.");
        }
    }

    public void clickOnChapterOne() {
        try {
            $(chapterOneLink).click();
        } catch (Exception e) {
            Assert.fail("Unable to click on chapter one link.");
        }
    }
}
