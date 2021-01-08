# CorCentricProjec
Steps to run this project:

1: Install Java and set its Environment Variable.

2: Install Intellij Idea from here https://www.jetbrains.com/idea/download/#section=windows if you are using windows.

3: Restart your system as it is required to complete Intellij Idea installation.

4: Open Intellij Idea and clone this project using this url https://github.com/FahadAbbasi446/ConCentricProjec.git.

5: Install Git for windows if it is not already installed (Intellij Idea will ask for Git installation).

6: Wait for project to load. Once loaded, download chromedriver.exe from here https://chromedriver.chromium.org/downloads and place it in project root
directory (Make sure you download the driver version same as the Chrome version installed on your system).

7: Add [-Dtestng.dtd.http=true] in Test Configuration by going to Run > Edit Configurations > Templates > TestNG > VM options.

8: Put path of ChromeDriver in TestSuite.xml against parameter chromeDriverPath if you want to run tests from TestSuite.xml. Else provide path in TestClass.java as optional parameter in doBeforeClass method if you want to run any method with @test on it.

9: Put URL in TestSuite.xml against parameter URL if you want to run tests from TestSuite.xml. Else provide URL in TestClass.java as optional parameter in verifyHomePage method if you want to run any method with @test on it.

10: After project is loaded right click on testng.xml and select run.
