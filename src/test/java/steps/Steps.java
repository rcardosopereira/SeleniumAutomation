package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.QAPage;
import java.util.List;
import java.util.Map;

public class Steps {

    private WebDriver driver;
    private QAPage qaPage;
    public Steps steps;


    @Before()
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        //System.setProperty("webdriver.geckodriver.driver","src/test/drivers/geckodriver.exe");
        driver = new ChromeDriver();
       //driver = new FirefoxDriver();
        qaPage = new QAPage(driver);
        steps = new Steps();
    }


    @Given("access in the localhost to click in a sort button")
    @Given("access in the localhost to delete")
    @Given("access in the localhost")
    public void access_in_the_localhost() {
        qaPage.browser();
    }

    @When("I write the question and answer")
    //Data Table
    public void i_write_the_question_and_answer(List<Map<String, String>> phrases) {
        for(Map<String, String> phrase : phrases) {
            driver.findElement(By.id("question")).sendKeys(phrase.get("Question"));
            driver.findElement(By.id("answer")).sendKeys(phrase.get("Answer"));
            qaPage.questionSorted().click();
        }
    }

    @Then("I see the question created")
    public void i_see_the_question_created() {
        String ActualTitle = driver.findElement(By.xpath("//*[contains(text(),'What´s your name?')]\n")).getText();
        String ExpectedTitle = "What´s your name?";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @When("I click in the Remove Questions button")
    public void i_click_in_the_remove_questions_button() {
        qaPage.questionRemoved().click();
    }

    @Then("I see the message No questions yet")
    public void i_see_the_message_no_questions_yet() {
        String ActualTitle = driver.findElement(By.xpath("//*[contains(text(),'No questions yet :-(')]")).getText();
        String ExpectedTitle = "No questions yet :-(";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @When("I click in the Sort Questions button")
    public void i_click_in_the_sort_questions_button() {
        qaPage.questionCreated().click();
    }

    @Then("I see the question created by sort")
    public void i_see_the_question_created_by_sort() {
         String ActualTitle = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div[1]/ul/li[1]/div")).getText();
         String ExpectedTitle = "0,02";
         Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @After()
    public void quitBrowser(){
        driver.quit();
    }
}
