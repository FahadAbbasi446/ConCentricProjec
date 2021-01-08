import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;

public class TestClass {
    HomePageObjects homePageObject;
    ChapterOnePageObjects chapterOnePageObject;

    @Parameters({"chromeDriverPath"})
    @BeforeClass
    public void doBeforeClass(@Optional("chromedriver.exe") String chromeDriverPath) {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        System.setProperty("selenide.browser", "Chrome");
        homePageObject = new HomePageObjects();
        chapterOnePageObject = new ChapterOnePageObjects();
    }

    @Parameters({"url"})
    @Test
    public void verifyHomePage(@Optional("http://book.theautomatedtester.co.uk/") String url) {
        // Opening required URL
        homePageObject.openURL(url);
        $(homePageObject.chapterOneLink).shouldBe(Condition.visible);
    }

    @Test(dependsOnMethods = {"verifyHomePage"})
    public void verifyTextOnChapter1View() {
        // Clicking on Chapter1 link.
        homePageObject.clickOnChapterOne();

        // Verifying text on Chapter1 view.
        chapterOnePageObject.verifyText();
    }

    @Test(dependsOnMethods = {"verifyHomePage", "verifyTextOnChapter1View"})
    public void navigateBackAndVerifyHomePage() {
        // Navigating back to homepage.
        chapterOnePageObject.clickOnHomePageLink();
        $(homePageObject.chapterOneLink).shouldBe(Condition.visible);
    }

    @AfterClass
    public void doAfterClass() {
        //Closing driver
        Selenide.closeWebDriver();
    }
}
