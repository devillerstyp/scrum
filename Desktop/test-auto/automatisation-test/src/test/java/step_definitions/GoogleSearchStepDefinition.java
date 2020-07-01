package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDefinition {
    WebDriver driver;
    String os = System.getProperty("os.name").toLowerCase();

    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {

        if (os.contains("windows")){
            System.setProperty("webdriver.chrome.driver","src/test/ressources/drivers/chromedriver.exe");
        } else if (os.contains("mac")){
            System.setProperty("webDriver.chrome.drive", "src/test/ressources/drivers/chromedriver");
        }
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) {
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys(arg0);
        driver.findElement(By.name("btnK")).click();
    }

    @Then("search result display the word {string}")
    public void searchResultDisplayTheWord(String arg0) {
        assertTrue(driver.getTitle().contains(arg0));
        driver.quit();

    }
}
