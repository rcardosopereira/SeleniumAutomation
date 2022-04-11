# Selenium Automation with BDD
# Tools (Frameworks)
a. Cucumber
b. Selenium WebDriver
c. Junit

# Important
Make sure you have JAVA 10 or above and MAVEN installed to run this test

# Test Execution
Maven command "mvn test" or "mvn verify" where you can specify all necessary arguments.

# Reporting
Maven Cucumber Reporter is used as a reporting tool. Report data will be placed in target/cucumber-html-reports/ folder (you can see it in overview-features.html file).

# Drivers (Gecko and Chrome)
Steps.java

@Before()<br /> 
    public void Setup(){<br /> 
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");<br />
        //System.setProperty("webdriver.geckodriver.driver","src/test/drivers/geckodriver.exe");<br />
        driver = new ChromeDriver();<br /> 
       //driver = new FirefoxDriver();<br /> 
        qaPage = new QAPage(driver);<br /> 
        steps = new Steps();<br /> 
    } 

To run in firefox browser, just uncomment the above and comment out the other two lines

# Maven Dependencies

<dependencies>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.2.3</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.2.3</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/junit/junit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.3</version>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>datatable</artifactId>
            <version>7.2.3</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-picocontainer</artifactId>
            <version>7.2.3</version>
            <scope>test</scope>
        </dependency>
</dependencies>
