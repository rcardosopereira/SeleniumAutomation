package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class QAPage {

    private WebDriver driver;


    public QAPage(WebDriver driver) {
        this.driver = driver;
    }

    public void browser() {
        driver.get("http://localhost:8000/");
    }

    public WebElement questionCreated() {
        WebElement questionC = driver.findElement(By.xpath("//button[contains(@class, \"btn btn-primary\")]"));
        return questionC;
    }

    public WebElement questionRemoved() {
        WebElement questionR = driver.findElement(By.xpath("//button[contains(@class, \"btn btn-danger\")]"));
        return questionR;
    }

    public WebElement questionSorted(){
        WebElement questionS =  driver.findElement(By.xpath("//button[contains(@class, \"btn btn-success\")]"));
        return questionS;
    }

}
